package by.epam.taskXML.application.action.service.impl;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class ShowPriceAction extends BaseStageAction implements Action {

    @Override
    public String description() {
        return "Show Gems with an Inputted Price\n";
    }

    @Override
    public void action() {
        serviceActions.showPriceObject();
    }
}
