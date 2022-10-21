package org.example;

import javax.swing.*;

public class MyguiTitledBorderForms {
    private JPanel mainpanel;
    private JPanel panel1;
    private JRadioButton ById;
    private JRadioButton ByName;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(
                10, 10, 500, 300
        );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyguiTitledBorderForms forms = new MyguiTitledBorderForms();
        frame.setContentPane(forms.mainpanel);

        frame.revalidate();
        frame.repaint();
    }
}
