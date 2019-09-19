package edu.kis.powp.jobs2d.features;

import edu.kis.powp.jobs2d.movment.MoveDriverAdapter;
import edu.kis.powp.jobs2d.movment.MovmentManager;
import edu.kis.powp.observer.Subscriber;


public class MoveFeature {
    private static MovmentManager movmentManager;

    public static void setupTransformManager() {
        movmentManager = new MovmentManager();
    }

    public static MovmentManager getMovmentManager() {
        return movmentManager;
    }

}