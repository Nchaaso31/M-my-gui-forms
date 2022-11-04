package org.example;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MyTableArticle {
    private JPanel mainPanel;
    private JTable tablaArticulos;

    public MyTableArticle() {
        AbstractTableModel model = new ArticleTableModel(
                List.of(
                        new Article(001,"Peppa",   4.5, 4),
                        new Article(001,"George",   2.2, 4),
                        new Article(001,"Bob",     3.3, 1) ,
                        new Article(001,"P", 6.6, 4),
                        new Article(001,"Peppa",   4.4, 45),
                        new Article(001,"George",   2.1, 10),
                        new Article(001,"Bob",     3.4, 45),
                        new Article(001,"P",  6.10, 1),
                        new Article(001,"Peppa",   4.7, 7),
                        new Article(001,"George",   2.4, 4),
                        new Article(001,"Bob",    3.1, 25),
                        new Article(001,"P", 6.4, 14),
                        new Article(001,"Peppa",   4.4, 45),
                        new Article(001,"George",   2.12, 42),
                        new Article(001,"Bob",     3.3, 7),
                        new Article(001,"P", 6.45, 9),
                        new Article(001,"Peppa",   4.4, 45),
                        new Article(001,"George",   2.12, 42),
                        new Article(001,"Bob",     3.3, 7),
                        new Article(001,"P", 6.45, 9),
                        new Article(001,"Peppa",   4.4, 45),
                        new Article(001,"George",   2.12, 42),
                        new Article(001,"Bob",     3.3, 7),
                        new Article(001,"P", 6.45, 9),
                        new Article(001,"Peppa",   4.4, 45),
                        new Article(001,"George",   2.12, 42),
                        new Article(001,"Bob",     3.3, 7),
                        new Article(001,"P", 6.45, 9),
                        new Article(001,"Peppa",   4.4, 45),
                        new Article(001,"George",   2.12, 42),
                        new Article(001,"Bob",     3.3, 7),
                        new Article(001,"P", 6.45, 9),
                        new Article(001,"Peppa",   4.10, 7),
                        new Article(001,"George",   2.78, 7)));
        tablaArticulos.setModel(model);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        var myForm = new MyTableArticle();

        frame.setContentPane(myForm.mainPanel);

        frame.setVisible(true);
        frame.pack();
        frame.revalidate();
        frame.repaint();
    }
}

