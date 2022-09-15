package by.epam.taskXML.dao.xmlParser;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class DOMParser {
    private static final String PATH = "gems/gems.xml";

    public List<Element> get() {
        try {
            var dbFactory = DocumentBuilderFactory.newInstance();
            var dBuilder = dbFactory.newDocumentBuilder();
            var inputFile = new File(Objects.requireNonNull(
                    getClass().getResource(format("/%s", PATH))).getFile());
            var doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Stone_Collection");
            return IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .map(item -> (Element) item)
                    .collect(Collectors.toList());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            return new ArrayList<>();
        }
    }
}
