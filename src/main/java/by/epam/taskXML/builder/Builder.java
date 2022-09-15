package by.epam.taskXML.builder;

import by.epam.taskXML.application.util.Color;
import by.epam.taskXML.application.util.NumberFaces;
import by.epam.taskXML.application.util.Origin;
import by.epam.taskXML.entity.Gem;

public interface Builder {

    void setType(Gem gems);
    void setQuantity(int quantity);
    void setPrice(int price);
    void setValue(double value);
    void setColor(Color color);
    void setOrigin(Origin origin);
    void setNumberOfFaces(NumberFaces numberOfFaces);
    void setTransparency(byte transparency);
}
