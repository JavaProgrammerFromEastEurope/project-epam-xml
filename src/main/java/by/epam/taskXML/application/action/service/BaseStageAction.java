package by.epam.taskXML.application.action.service;

import by.epam.taskXML.application.action.StageActionFactory;
import by.epam.taskXML.controller.impl.GemController;

public abstract class BaseStageAction {

    protected final GemController serviceActions;
    protected final StageActionFactory stageFactory;

    public BaseStageAction() {
        this.serviceActions = new GemController();
        this.stageFactory = StageActionFactory.getInstance();
    }
}
