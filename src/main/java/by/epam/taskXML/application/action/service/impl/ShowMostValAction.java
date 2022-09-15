package by.epam.taskXML.application.action.service.impl;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class ShowMostValAction extends BaseStageAction implements Action {

    @Override
    public String description() {
        return "Show Most Valuable Gem\n";
    }

    @Override
    public void action() {
        serviceActions.showMostValObject();
    }
}
