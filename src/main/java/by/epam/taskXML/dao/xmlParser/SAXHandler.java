package by.epam.taskXML.dao.xmlParser;

import org.apache.logging.log4j.Level;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import static by.epam.taskXML.application.util.Const.*;

public class SAXHandler extends DefaultHandler {

    boolean bColor  = false;
    boolean bGem   = false;
    boolean bNFaces = false;
    boolean bOrigin = false;
    boolean bPrice = false;
    boolean bQuantity = false;
    boolean bTrans = false;
    boolean bValue = false;

    @Override
    public void startElement(String uri,
             String lName, String qName, Attributes attr) throws SAXException {
        if (qName.equalsIgnoreCase("Stone_Collection")) {

        } else if (qName.equalsIgnoreCase("color")) {
            bColor = true;
        } else if (qName.equalsIgnoreCase("gem")) {
            bGem = true;
        } else if (qName.equalsIgnoreCase("numberOfFaces")) {
            bNFaces = true;
        } else if (qName.equalsIgnoreCase("origin")) {
            bOrigin = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        } else if (qName.equalsIgnoreCase("quantity")) {
            bQuantity = true;
        } else if (qName.equalsIgnoreCase("transparency")) {
            bTrans = true;
        } else if (qName.equalsIgnoreCase("value")) {
            bValue = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bColor) {
            logger.printf(Level.DEBUG, "Color: %s", new String(ch, start, length));
            bColor = false;
        } else if (bGem) {
            logger.printf(Level.DEBUG, "Gem: %s", new String(ch, start, length));
            bGem = false;
        } else if (bNFaces) {
            logger.printf(Level.DEBUG, "Number Of Faces: %s", new String(ch, start, length));
            bNFaces = false;
        } else if (bOrigin) {
            logger.printf(Level.DEBUG, "Origin: %s", new String(ch, start, length));
            bOrigin = false;
        } else if (bPrice) {
            logger.printf(Level.DEBUG, "Price: %s", new String(ch, start, length));
            bPrice = false;
        } else if (bQuantity) {
            logger.printf(Level.DEBUG, "Quantity: %s", new String(ch, start, length));
            bQuantity = false;
        } else if (bTrans) {
            logger.printf(Level.DEBUG, "Transparency: %s", new String(ch, start, length));
            bTrans = false;
        } else if (bValue) {
            logger.printf(Level.DEBUG, "Value: %s", new String(ch, start, length));
            bValue = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Stone_Collection")) {
            logger.printf(Level.DEBUG, "End Element: %s", qName);
        }
    }
}
