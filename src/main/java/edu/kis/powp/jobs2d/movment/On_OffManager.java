package edu.kis.powp.jobs2d.movment;

import edu.kis.powp.observer.Publisher;

public class On_OffManager extends Publisher {
    public static String switchOnOff = "On";

    public void on(){
        switchOnOff = "On";
        notifyObservers();
    }

    public void off(){
        notifyObservers();
    }

    public String getswitchOnOff(){
        return switchOnOff;
    }


}
