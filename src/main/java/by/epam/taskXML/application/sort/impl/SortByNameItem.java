package by.epam.taskXML.application.sort.impl;

import by.epam.taskXML.application.sort.SortTemplate;
import by.epam.taskXML.entity.GemCollection;


/**
 * Overriding Compare method of the Comparator interface
 * to compare two Gem Collections by the name field.
 */
public class SortByNameItem implements SortTemplate<GemCollection> {
    @Override
    public int compare(GemCollection o1, GemCollection o2) {
        return o1.getGem().getName().compareTo(o2.getGem().getName());
    }
}