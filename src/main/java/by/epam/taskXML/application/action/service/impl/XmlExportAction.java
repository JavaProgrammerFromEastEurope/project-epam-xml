package by.epam.taskXML.application.action.service.impl;

import by.epam.taskXML.application.action.Action;
import by.epam.taskXML.application.action.service.BaseStageAction;

public class XmlExportAction extends BaseStageAction implements Action, Runnable {

    @Override
    public String description() {
        return "Export Data to XML File\n";
    }

    @Override
    public void action() {
        Thread thread = new Thread(this, "XmlExportItemThread");
        thread.start();
    }

    @Override
    public void run() {
        serviceActions.xmlExportObject();
    }
}
