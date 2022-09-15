package by.epam.taskXML.application.action.service.impl;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class AddObjectAction extends BaseStageAction implements Action {

    @Override
    public String description() {
        return "Add New Gem Action\n";
    }

    @Override
    public void action() {
        serviceActions.addGemAction();
    }
}
