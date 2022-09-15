package by.epam.taskXML.application.action.stage;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.StageActionFactory;

public class SetDefaultAction implements Action {

    private final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Return to Main Menu\n";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getDefaultStage());
    }
}
