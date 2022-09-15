package by.epam.taskXML.application.action.service.impl;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class RemoveObjectAction extends BaseStageAction implements Action {

    @Override
    public String description() {
        return "Remove Gem Action\n";
    }

    @Override
    public void action() {
        serviceActions.removeGemAction();
    }
}
