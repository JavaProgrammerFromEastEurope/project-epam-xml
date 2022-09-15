package by.epam.taskXML.dao.xmlParser;

import by.epam.taskXML.dao.Item;
import by.epam.taskXML.entity.GemCollection;
import by.epam.taskXML.xmlWrapper.GemWrapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

public class JAXBParser implements Item {

    private static final String PATH = "gems/gems.xml";
    private final ClassLoader classLoader = getClass().getClassLoader();
    @Override
    public List<GemCollection> get() {
        try {
            JAXBContext context = JAXBContext.newInstance(GemWrapper.class, GemCollection.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            var file = new File(Objects.requireNonNull(
                    getClass().getResource(format("/%s", PATH))).getFile());
            GemWrapper gemWrapper = (GemWrapper) unmarshaller.unmarshal(file);
            var items = gemWrapper.getItems();
            return items == null ? new ArrayList<>() : items;
        } catch (JAXBException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void save(List<GemCollection> gemCollections) {
        GemWrapper gemWrapper = new GemWrapper(gemCollections);
        try {
            JAXBContext context = JAXBContext.newInstance(GemWrapper.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            var file = new File(Objects.requireNonNull(
                    classLoader.getResource(PATH)).getFile());
            marshaller.marshal(gemWrapper, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
