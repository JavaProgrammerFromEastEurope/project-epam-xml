package by.epam.taskXML.application.action.service.impl;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class UpdateObjectAction extends BaseStageAction implements Action {

    @Override
    public String description() {
        return "Update Gem Action\n";
    }

    @Override
    public void action() {
        serviceActions.updateGemAction();
    }
}
