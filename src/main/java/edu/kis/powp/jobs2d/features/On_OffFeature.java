package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.OnOptionListner;
import edu.kis.powp.jobs2d.events.SelectClearPanelOptionListener;
import edu.kis.powp.jobs2d.movment.On_OffManager;

public class On_OffFeature {
    private static On_OffManager on_offManager;

    public static void setupOn_OffPlugin(Application application) {
        OnOptionListner onOptionListner = new OnOptionListner();

        on_offManager = new On_OffManager();
        application.addComponentMenu(On_OffManager.class, "TransformCtrl", 5);
        application.addComponentMenuElement(On_OffManager.class, "On", onOptionListner);
        application.addComponentMenuElement(On_OffManager.class, "Off", onOptionListner);
    }

    public static On_OffManager geton_offManager(){
        return on_offManager;
    }
}
