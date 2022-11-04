package org.example;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StudentTableModel extends AbstractTableModel {
    private final static int NAME_COLUMN_INDEX = 1;
    private final static int SURNAME_COLUMN_INDEX = 2;
    private final static int NIF_COLUMN_INDEX = 0;
    private final static int AGE_COLUMN_INDEX = 3;

    private List<Student> students;
    private JPanel panel1;
    private JTable tablaEstudiantes;

    public StudentTableModel(List<Student> students) {
        super();
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case NAME_COLUMN_INDEX:
                return "Nombre";
            case SURNAME_COLUMN_INDEX:
                return "Apellidos";
            case NIF_COLUMN_INDEX:
                return "NIF";
            case AGE_COLUMN_INDEX:
                return "Edad";
            default:
                throw new RuntimeException("No existe la columna " + column);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case NAME_COLUMN_INDEX:
                return student.getName();
            case SURNAME_COLUMN_INDEX:
                return student.getSurname();
            case NIF_COLUMN_INDEX:
                return student.getNif();
            case AGE_COLUMN_INDEX:
                return student.getAge();
            default:
                throw new RuntimeException("No existe la columna " + columnIndex);
        }

    }
}