package by.epam.taskXML.builder;

import by.epam.taskXML.application.util.Color;
import by.epam.taskXML.application.util.NumberFaces;
import by.epam.taskXML.application.util.Origin;
import by.epam.taskXML.entity.Gem;
import by.epam.taskXML.entity.gem.GemFactory;

import static by.epam.taskXML.application.util.Const.*;
import static by.epam.taskXML.application.util.Input.*;

public class Director {
    private final GemFactory gemFactory = GemFactory.getInstance();

    public void constructGem(Builder builder){
        builder.setType(initGem());
        builder.setPrice(getInteger(INPUT_PRICE));
        builder.setQuantity(getInteger(INPUT_NUMBER));
        builder.setValue(getDouble(INPUT_VALUE));
        builder.setTransparency(initTransparency());
        builder.setColor(initColor());
        builder.setNumberOfFaces(initNumberFaces());
        builder.setOrigin(initOrigin());
    }

    private byte initTransparency() {
        return (byte) inputPosition(100, INPUT_TRANS);
    }
    private Gem initGem() {
        return inputPosition(2, GEMS_CHOOSER) == 1
                ? initPreciousGem() : initSemiPreciousGem();
    }

    private Gem initPreciousGem() {
        return gemFactory.getPreciousGem(
                inputPosition(5, PRECIOUS_CHOOSER));
    }

    private Gem initSemiPreciousGem() {
        return gemFactory.getSemiPreciousGem(
                inputPosition(10, SEMI_PRECIOUS_CHOOSER));
    }
    private Color initColor() {
        return Color.getColor(
                inputPosition(28, COLOR_CHOOSER));
    }

    private NumberFaces initNumberFaces() {
        return NumberFaces.getNumberFaces(
                inputPosition(4,15, NUMBER_FACES_CHOOSER));
    }

    private Origin initOrigin() {
        return Origin.getOrigin(
                inputPosition(22, ORIGIN_CHOOSER));
    }
}
