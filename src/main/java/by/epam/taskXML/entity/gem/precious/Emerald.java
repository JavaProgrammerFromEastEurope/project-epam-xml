package by.epam.taskXML.entity.gem.precious;

import by.epam.taskXML.application.util.Preciousness;
import by.epam.taskXML.entity.Gem;

public class Emerald extends Gem {
    public Emerald(String name) {
        super(name, Preciousness.Precious);
    }
}
