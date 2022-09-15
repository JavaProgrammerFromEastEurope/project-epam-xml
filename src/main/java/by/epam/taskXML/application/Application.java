package by.epam.taskXML.application;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.StageActionFactory;
import by.epam.taskXML.application.exception.StopApplicationException;
import by.epam.taskXML.application.exception.WrongValueException;
import by.epam.taskXML.application.util.Input;

import static java.lang.System.out;

public class Application {

    private static final StageActionFactory stageFactory
            = StageActionFactory.getInstance();

    public static void startEntertainment() {
        out.println("Welcome! Entertainment has become!");
        actionStages();
    }

    private static void actionStages() {
        stageFactory.activeStages();
        while (true) try {
            getActionStage().action();
        } catch (StopApplicationException e) {
            break;
        }
    }

    private static Action getActionStage() {
        stageFactory.showStageMenu();
        int index = Input.anyIntInitialize();
        try {
            return stageFactory.getActionStage(index);
        } catch (WrongValueException e) {
            out.println(e.getMessage());
        }
        return getActionStage();
    }
}
