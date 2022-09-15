package by.epam.taskXML.entity.gem;

import by.epam.taskXML.entity.Gem;
import by.epam.taskXML.entity.gem.precious.*;
import by.epam.taskXML.entity.gem.semiPrecious.*;

import java.util.HashMap;
import java.util.Map;

public class GemFactory {
    public static GemFactory instance = new GemFactory();

    public static GemFactory getInstance() {
        return instance;
    }

    private final Map<Integer, Gem> preciousGems = new HashMap<>();
    private final Map<Integer, Gem> semiPreciousGems = new HashMap<>();


    private GemFactory() {
        preciousGems.put(1, new Alexandrite("Alexandrite"));
        preciousGems.put(2, new Diamond("Diamond"));
        preciousGems.put(3, new Emerald("Emerald"));
        preciousGems.put(4, new Ruby("Ruby"));
        preciousGems.put(5, new Sapphire("Sapphire"));

        semiPreciousGems.put(1, new Agate("Agate"));
        semiPreciousGems.put(2, new Amethyst("Amethyst"));
        semiPreciousGems.put(3, new Aquamarine("Aquamarine"));
        semiPreciousGems.put(4, new Aventurine("Aventurine"));
        semiPreciousGems.put(5, new Chrysolite("Chrysolite"));
        semiPreciousGems.put(6, new Citrine("Citrine"));
        semiPreciousGems.put(7, new Pomegranate("Granate"));
        semiPreciousGems.put(8, new Quartz("Quartz"));
        semiPreciousGems.put(9, new Rhinestone("Rhinestone"));
        semiPreciousGems.put(10, new Topaz("Topaz"));
    }

    public Gem getPreciousGem(int i) {
        return switch (i) {
            case 1 -> preciousGems.get(1);
            case 2 -> preciousGems.get(2);
            case 3 -> preciousGems.get(3);
            case 4 -> preciousGems.get(4);
            case 5 -> preciousGems.get(5);
            default -> preciousGems.get(5);
        };
    }

    public Gem getSemiPreciousGem(int i) {
        return switch (i) {
            case 1 -> semiPreciousGems.get(1);
            case 2 -> semiPreciousGems.get(2);
            case 3 -> semiPreciousGems.get(3);
            case 4 -> semiPreciousGems.get(4);
            case 5 -> semiPreciousGems.get(5);
            case 6 -> semiPreciousGems.get(6);
            case 7 -> semiPreciousGems.get(7);
            case 8 -> semiPreciousGems.get(8);
            case 9 -> semiPreciousGems.get(9);
            case 10 -> semiPreciousGems.get(10);
            default -> semiPreciousGems.get(10);
        };
    }
}
