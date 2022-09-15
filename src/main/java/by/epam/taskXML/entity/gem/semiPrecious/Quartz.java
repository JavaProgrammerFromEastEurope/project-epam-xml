package by.epam.taskXML.entity.gem.semiPrecious;

import by.epam.taskXML.application.util.Preciousness;
import by.epam.taskXML.entity.Gem;

public class Quartz extends Gem {
    public Quartz(String name) {
        super(name, Preciousness.Semi_Precious);
    }
}
