package by.epam.taskXML.entity;

import by.epam.taskXML.application.util.Color;
import by.epam.taskXML.application.util.NumberFaces;
import by.epam.taskXML.application.util.Origin;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class GemCollection implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private int price;
    private Gem gem;
    private int quantity;
    private NumberFaces numberOfFaces;
    private Color color;
    private Origin origin;
    private double value;
    private byte transparency;

    public GemCollection(){}

    public GemCollection(Gem gems, int price, int quantity,
                         NumberFaces numberOfFaces, Color color,
                         Origin origin, double value, byte transparency) {
        this.price = price * quantity;
        this.gem = gems;
        this.quantity = quantity;
        this.numberOfFaces = numberOfFaces;
        this.color = color;
        this.origin = origin;
        this.value = value;
        this.transparency = transparency;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setGem(Gem gem) {
        this.gem = gem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setNumberOfFaces(NumberFaces numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setTransparency(byte transparency) {
        this.transparency = transparency;
    }


    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Gem getGem() {
        return gem;
    }

    public int getQuantity() {
        return quantity;
    }

    public NumberFaces getNumberOfFaces(NumberFaces numberFaces) {
        return numberOfFaces;
    }

    public Color getColor() {
        return color;
    }

    public Origin getOrigin() {
        return origin;
    }

    public double getValue() {
        return value;
    }

    public byte getTransparency() {
        return transparency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemCollection that = (GemCollection) o;
        return id == that.id
                && price == that.price
                && quantity == that.quantity
                && value == that.value
                && transparency == that.transparency
                && Objects.equals(gem, that.gem)
                && numberOfFaces == that.numberOfFaces
                && color == that.color
                && origin == that.origin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price,
                gem, quantity, numberOfFaces,
                        color, origin, value, transparency);
    }

    @Override
    public String toString() {
        return ("GemCollection{" +
                "id=%d, price=%d, gems=%s, quantity=%d," +
                " numberOfFaces=%s, color=%s, origin=%s," +
                " value=%.2f, transparency=%s}")
                .formatted(id, price, gem, quantity, numberOfFaces,
                            color, origin, value, transparency);
    }
}
