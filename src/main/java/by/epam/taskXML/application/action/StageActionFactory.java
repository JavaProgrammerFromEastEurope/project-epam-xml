package by.epam.taskXML.application.action;

import by.epam.taskXML.application.action.service.impl.*;
import by.epam.taskXML.application.action.sort.SortByNameAction;
import by.epam.taskXML.application.action.sort.SortByPriceAction;
import by.epam.taskXML.application.action.stage.SetDefaultAction;
import by.epam.taskXML.application.action.stage.SetSortStageAction;
import by.epam.taskXML.application.exception.WrongValueException;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class StageActionFactory {

    private static final StageActionFactory instance = new StageActionFactory();
    public static StageActionFactory getInstance() {
        return instance;
    }
    private final Map<Integer, Action> defaultStage = new HashMap<>();
    private final Map<Integer, Action> sortStage = new HashMap<>();
    private Map<Integer, Action> currentStage = defaultStage;

    private StageActionFactory() {
        defaultStage.put(2, new AddObjectAction());
        defaultStage.put(3, new UpdateObjectAction());
        defaultStage.put(4, new RemoveObjectAction());
        defaultStage.put(5, new ShowMostValAction());
        defaultStage.put(6, new ShowPriceAction());
        defaultStage.put(7, new XmlExportAction());
    }
    public void activeStages() {
        sortStage.put(0, new SetDefaultAction());
        sortStage.put(1, new SortByNameAction());
        sortStage.put(2, new SortByPriceAction());

        defaultStage.put(0, new StopApplicationAction());
        defaultStage.put(1, new SetSortStageAction());
    }


    public Map<Integer, Action> getDefaultStage() {
        return defaultStage;
    }

    public Map<Integer, Action> getSortStage() {
        return sortStage;
    }

    public void setCurrentStage(Map<Integer, Action> stage) {
        currentStage = stage;
    }

    public Action getActionStage(int index) throws WrongValueException {
        if (currentStage.containsKey(index)) {
            return currentStage.get(index);
        }
        throw new WrongValueException(index);
    }

    public void showStageMenu() {
        currentStage.forEach((key, value) ->
                out.printf("%d - %s%n", key, value.description()));
        out.println("Choose the action you want:");
    }
}
