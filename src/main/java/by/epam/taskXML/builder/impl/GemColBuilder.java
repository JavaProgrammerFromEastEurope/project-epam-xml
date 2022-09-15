package by.epam.taskXML.builder.impl;

import by.epam.taskXML.application.util.Color;
import by.epam.taskXML.application.util.NumberFaces;
import by.epam.taskXML.application.util.Origin;
import by.epam.taskXML.builder.Builder;
import by.epam.taskXML.entity.Gem;
import by.epam.taskXML.entity.GemCollection;

public class GemColBuilder implements Builder {

    private Gem gem;
    private int price;
    private int quantity;
    private NumberFaces numberOfFaces;
    private Color color;
    private Origin origin;
    private double value;
    private byte transparency;

    @Override
    public void setType(Gem gem) {
        this.gem = gem;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setNumberOfFaces(NumberFaces numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void setTransparency(byte transparency) {
        this.transparency = transparency;
    }

    public GemCollection getGemCollection() {
        return new GemCollection(gem, price, quantity,
                numberOfFaces, color, origin, value, transparency);
    }
}
