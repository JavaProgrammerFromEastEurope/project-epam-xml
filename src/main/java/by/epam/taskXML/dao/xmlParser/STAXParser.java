package by.epam.taskXML.dao.xmlParser;

import by.epam.taskXML.application.util.Color;
import by.epam.taskXML.application.util.NumberFaces;
import by.epam.taskXML.application.util.Origin;
import by.epam.taskXML.entity.GemCollection;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class STAXParser {
    private static final String PATH = "gems/gems.xml";

    public List<GemCollection> parseXMLFile() {
        List<GemCollection> gemCollections = new ArrayList<>();
        GemCollection gemCollection = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(PATH));
            while (reader.hasNext()) {
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("Stone_Collection")) {
                        gemCollection = new GemCollection();
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            gemCollection.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("color")) {
                        xmlEvent = reader.nextEvent();
                        gemCollection.setColor(Color.getColor(Integer.parseInt(xmlEvent.asCharacters().getData())));
                    } else if (startElement.getName().getLocalPart().equals("origin")) {
                        xmlEvent = reader.nextEvent();
                        gemCollection.setOrigin(Origin.getOrigin(Integer.parseInt(xmlEvent.asCharacters().getData())));
                    } else if (startElement.getName().getLocalPart().equals("NumberOfFaces")) {
                        xmlEvent = reader.nextEvent();
                        gemCollection.getNumberOfFaces(NumberFaces.getNumberFaces(Integer.parseInt(xmlEvent.asCharacters().getData())));
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("Stone_Collection")) {
                        gemCollections.add(gemCollection);
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException exc) {
        }
        return gemCollections;
    }
}
