package org.example;

import javax.swing.*;

public class myRadioButtonForms {
    private JPanel panel1;
    private JPanel mainPanel;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton manchitoshRadioButton;
    private JComboBox comboBox1;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        myRadioButtonForms myRadio = new myRadioButtonForms();

        frame.setContentPane(myRadio.mainPanel);
        frame.setVisible(true);
        frame.pack();
        frame.repaint();
        frame.revalidate();
    }
}
