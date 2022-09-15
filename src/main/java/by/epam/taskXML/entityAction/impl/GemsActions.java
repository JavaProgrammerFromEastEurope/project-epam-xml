package by.epam.taskXML.entityAction.impl;

import by.epam.taskXML.application.exception.NotFoundItemException;
import by.epam.taskXML.application.sort.impl.SortByNameItem;
import by.epam.taskXML.application.sort.impl.SortByPriceItem;
import by.epam.taskXML.builder.Director;
import by.epam.taskXML.builder.impl.GemColBuilder;
import by.epam.taskXML.dao.serializer.SerializableItem;
import by.epam.taskXML.dao.xmlParser.JAXBParser;
import by.epam.taskXML.entity.GemCollection;
import by.epam.taskXML.entityAction.ActionTemplate;
import org.apache.logging.log4j.Level;

import java.util.Comparator;
import java.util.List;

import static by.epam.taskXML.application.util.Const.*;
import static by.epam.taskXML.application.util.Input.*;
import static java.lang.String.format;
import static java.lang.System.out;

public class GemsActions implements ActionTemplate {

    private final SerializableItem serializableItems = new SerializableItem();
    private final JAXBParser xmlGems = new JAXBParser();
    private final Director director = new Director();
    private final GemColBuilder builder = new GemColBuilder();

    private void sortAndPrintList(Comparator<GemCollection> comparator) {
        List<GemCollection> gemCollections = serializableItems.get();
        gemCollections.sort(comparator);
        out.println(printListItems(gemCollections));
        logger.printf(Level.INFO,
                printListItems(gemCollections));
    }

    private String printListItems(List<GemCollection> gemCollections) {
        var resultList = new StringBuilder();
        if (gemCollections.size() == 0) {
            out.println(EMPTY_GEM_LIST);
            return "";
        }
        for (var gemCollection : gemCollections) {
            resultList.append(format(MESSAGE_FORMAT, gemCollection));
        }
        return resultList.toString();
    }

    @Override
    public void addGemObject() {
        try {
            director.constructGem(builder);
            serializableItems.add(builder.getGemCollection());
            out.println(SUCCESS_ADDING);
        } catch (Exception e) {
            logger.printf(Level.ERROR, ERROR_ADDING, e.getMessage());
        }
    }


    @Override
    public void updateGemObject() {
        try {
            long id = getInteger(ID_TO_UPDATE);
            director.constructGem(builder);
            var gemCollection = builder.getGemCollection();
            gemCollection.setId(id);
            serializableItems.update(gemCollection);
            out.println(SUCCESS_UPDATE);
        } catch (NotFoundItemException e) {
            out.printf(ERROR_UPDATE, e.getMessage());
            logger.printf(Level.ERROR, ERROR_UPDATE, e.getMessage());
        }
    }

    @Override
    public void removeGemObject() {
        try {
            long id = getInteger(ID_TO_REMOVE);
            serializableItems.remove(id);
            out.println(SUCCESS_REMOVE);
        } catch (NotFoundItemException e) {
            out.printf(ERROR_REMOVE, e.getMessage());
            logger.printf(Level.ERROR, ERROR_REMOVE, e.getMessage());
        }
    }

    @Override
    public void sortByNameObject() {
        sortAndPrintList(new SortByNameItem());
    }

    @Override
    public void sortByPriceObject() {
        sortAndPrintList(new SortByPriceItem());
    }

    @Override
    public void showMostValObject() {
        List<GemCollection> gemCollection = serializableItems.get();
        if (gemCollection.size() == 0) {
            out.println(EMPTY_GEM_LIST);
            return;
        }
        gemCollection.sort(new SortByPriceItem());
        out.printf(HIGHEST_PRICE, gemCollection.get(0));
        logger.printf(Level.INFO, HIGHEST_PRICE, gemCollection.get(0));
    }

    @Override
    public void showPriseObject() {
        List<GemCollection> gemCollections = serializableItems.get();
        if (gemCollections.size() == 0) {
            out.println(EMPTY_GEM_LIST);
            return;
        }
        int price = getInteger(INPUT_PRICE);
        for (GemCollection gem : gemCollections) {
            if (gem.getPrice() == price) {
                out.printf(MESSAGE_FORMAT, gem);
                logger.printf(Level.INFO, MESSAGE_FORMAT, gem);
                return;
            }
        }
        out.printf(GEM_PRICE_NOT_FOUND, PRICE_GEM, price);
        logger.printf(Level.INFO,
                GEM_PRICE_NOT_FOUND, PRICE_GEM, price);
    }

    @Override
    public void xmlExportObject() {
        xmlGems.save(serializableItems.get());
        out.println(SUCCESS_EXPORT);
        logger.printf(Level.INFO, SUCCESS_EXPORT);
    }
}