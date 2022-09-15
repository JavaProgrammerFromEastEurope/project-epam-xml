package by.epam.taskXML.xmlWrapper;

import by.epam.taskXML.entity.GemCollection;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "Diamond_Fund")
public class GemWrapper {
    private List<GemCollection> gemCollection;

    public GemWrapper(){}

    public GemWrapper(List<GemCollection> gemCollection) {
        this.gemCollection = gemCollection;
    }

    public void setItems(List<GemCollection> gemCollection) {
         this.gemCollection = gemCollection;
    }

    @XmlElement(name = "Stone_Collection")
    public List<GemCollection> getItems() {
        return gemCollection;
    }
}