package by.epam.taskXML.application.action.stage;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.StageActionFactory;

public class SetSortStageAction implements Action {

    final StageActionFactory stageFactory = StageActionFactory.getInstance();

    @Override
    public String description() {
        return "Show Gem Items\n";
    }

    @Override
    public void action() {
        stageFactory.setCurrentStage(stageFactory.getSortStage());
    }
}
