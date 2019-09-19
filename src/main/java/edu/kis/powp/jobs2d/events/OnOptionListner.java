package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.features.On_OffFeature;
import edu.kis.powp.jobs2d.movment.On_OffManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnOptionListner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        On_OffFeature.geton_offManager().on();
    }
}
