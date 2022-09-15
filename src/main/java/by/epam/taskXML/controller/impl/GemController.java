package by.epam.taskXML.controller.impl;

import by.epam.taskXML.controller.ActionController;
import by.epam.taskXML.entityAction.ActionFactory;
import by.epam.taskXML.entityAction.ActionTemplate;

public class GemController implements ActionController {
    private final ActionTemplate gemActions;

    public GemController() {
        this.gemActions = ActionFactory.getInstance().getGemActions();
    }

    @Override
    public void addGemAction() {
        this.gemActions.addGemObject();
    }

    @Override
    public void updateGemAction() {
        this.gemActions.updateGemObject();
    }

    @Override
    public void removeGemAction() {
        this.gemActions.removeGemObject();
    }

    @Override
    public void sortByNameAction() {
        this.gemActions.sortByNameObject();
    }

    @Override
    public void sortByPriceAction() {
        this.gemActions.sortByPriceObject();
    }

    @Override
    public void showMostValObject() {
        this.gemActions.showMostValObject();
    }

    @Override
    public void showPriceObject() {
        this.gemActions.showPriseObject();
    }

    @Override
    public void xmlExportObject() {
        this.gemActions.xmlExportObject();
    }
}