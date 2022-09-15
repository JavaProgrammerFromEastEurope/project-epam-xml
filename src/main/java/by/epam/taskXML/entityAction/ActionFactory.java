package by.epam.taskXML.entityAction;

import by.epam.taskXML.entityAction.impl.GemsActions;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private static final ActionFactory instance = new ActionFactory();

    public static ActionFactory getInstance() {
        return instance;
    }
    private final Map<Integer, ActionTemplate> appActions = new HashMap<>();

    private ActionFactory() {
        appActions.put(1, new GemsActions());
    }

    public ActionTemplate getGemActions() {
        return appActions.get(1);
    }
}
