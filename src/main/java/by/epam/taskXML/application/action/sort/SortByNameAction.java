package by.epam.taskXML.application.action.sort;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class SortByNameAction extends BaseStageAction implements Action {
    @Override
    public String description() {
        return "Sorting Gems By Name";
    }

    @Override
    public void action() {
        serviceActions.sortByNameAction();
        stageFactory.setCurrentStage(stageFactory.getDefaultStage());
    }
}
