package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // demo GUI
        System.out.println("Program started");
        JFrame frame = new JFrame("Genshin Impact Optimiser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGUI = new GUI(1300, 650);
        frame.add(myGUI);
        frame.pack();
        frame.setVisible(true);
    }
}