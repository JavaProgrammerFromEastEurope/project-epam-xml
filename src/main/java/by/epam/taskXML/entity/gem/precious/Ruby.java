package by.epam.taskXML.entity.gem.precious;

import by.epam.taskXML.application.util.Preciousness;
import by.epam.taskXML.entity.Gem;
public class Ruby extends Gem {
    public Ruby(String name) {
        super(name, Preciousness.Precious);
    }
}
