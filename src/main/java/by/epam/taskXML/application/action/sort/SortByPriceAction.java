package by.epam.taskXML.application.action.sort;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class SortByPriceAction extends BaseStageAction implements Action {
    @Override
    public String description() {
        return "Sorting Gems By Price";
    }

    @Override
    public void action() {
        serviceActions.sortByPriceAction();
        stageFactory.setCurrentStage(stageFactory.getDefaultStage());
    }
}
