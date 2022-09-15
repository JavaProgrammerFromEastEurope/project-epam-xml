package by.epam.taskXML.application.action;

import by.epam.taskXML.application.exception.StopApplicationException;

public class StopApplicationAction implements Action {

    @Override
    public String description() {
        return "Exit From Application\n";
    }

    @Override
    public void action() throws StopApplicationException {
        throw new StopApplicationException();
    }
}
