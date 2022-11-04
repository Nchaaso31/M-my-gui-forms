package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ArticleTableModel extends AbstractTableModel {
    private enum ArticleTableColumns {
        // Aquí defino todas las columnas
        id("ID"),
        name("Nombre"),
        price("Precio"),
        amount("Cantidad");

        // Estos son los campos de cada columna
        final String header;

        ArticleTableColumns(String header) {
            this.header = header;
        }
    }

    private List<Article> articles;

    public ArticleTableModel(List<Article> articles) {
        super();
        this.articles = articles;
    }

    @Override
    public int getRowCount() {
        return articles.size();
    }

    @Override
    public int getColumnCount() {
        return ArticleTableColumns.values().length;
    }

    @Override
    public String getColumnName(int column) {
        return ArticleTableColumns
                .values()[column].header;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Article article = articles.get(rowIndex);
        switch (ArticleTableColumns.values()[columnIndex]) {
            case id:
                return article.getId();
            case name:
                return article.getName();
            case price:
                return article.getPrice();
            case amount:
                return article.getAmount();
            default:
                throw new RuntimeException("No existe la columna " + columnIndex);
        }
    }
}
