package by.epam.taskXML.application.action;

import by.epam.taskXML.application.exception.StopApplicationException;

public interface Action {
    String description();

    void action() throws StopApplicationException;
}
