package by.epam.taskXML.dao.xmlParser;

import org.apache.logging.log4j.Level;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static by.epam.taskXML.application.util.Const.logger;
import static java.lang.String.format;

public class SAXParser {
    private static final String PATH = "gems/gems.xml";

    public void get() {
        try {
            var factory = SAXParserFactory.newInstance();
            var saxParser = factory.newSAXParser();
            var inputFile = new File(Objects.requireNonNull(
                    getClass().getResource(format("/%s", PATH))).getFile());
            SAXHandler saxHandler = new SAXHandler();
            saxParser.parse(inputFile, saxHandler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            logger.printf(Level.DEBUG, "Error while reading file: %s", e);
        }
    }
}
