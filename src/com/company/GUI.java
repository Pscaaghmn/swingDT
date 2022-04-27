package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    // canvas for other GUI widgets

    JLabel label1, label2;
    JComboBox comboBox;

    public GUI(int width, int height) {
        System.out.println("GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        label1 = new JLabel("Artifact Set:");
        comboBox = new JComboBox(new String[]{"Gladiator's Finale", "Wanderer's Troupe", "Thundersoother", "Thundering Fury", "Maiden Beloved", "Viridescent Venerer", "Crimson Witch of Flames", "Lavawalker", "Noblesse Oblige", "Bloodstained Chivalry", "Archaic Petra", "Retracing Bolide", "Blizzard Strayer", "Heart of Depth", "Tenacity of the Millelith", "Pale Flame", "Shimenawa's Reminiscence", "Emblem of Severed Fate", "Husk of Opulent Dreams", "Ocean-Hued Clam", "Vermillion Hereafter", "Echoes of an Offering"});

        label1.setBounds(20,0, 100, 20);
        comboBox.setBounds(120,0, 400, 20);

        add(label1);
        add(comboBox);

    }
}