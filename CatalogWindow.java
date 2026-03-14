package code;

import javax.swing.*;
import java.awt.*;

class CatalogWindow extends JFrame {

    public CatalogWindow() {
        setTitle("Каталог книг");
        setSize(900, 500);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(245, 248, 255));
        setLayout(new BorderLayout(15, 15));

        // ===== Панель поиска =====
        JPanel searchPanel = new JPanel(new GridLayout(2, 4, 10, 10));
        searchPanel.setBackground(new Color(245, 248, 255));
        searchPanel.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(new Color(180, 200, 240)),
                        "Поиск",
                        0, 0,
                        new Font("Segoe UI", Font.BOLD, 14)
                )
        );

        searchPanel.add(new JLabel("Название:"));
        searchPanel.add(new JTextField());

        searchPanel.add(new JLabel("Автор:"));
        searchPanel.add(new JTextField());

        searchPanel.add(new JLabel("Жанр:"));
        searchPanel.add(new JTextField());

        searchPanel.add(new JLabel("Год:"));
        searchPanel.add(new JTextField());

        // ===== Таблица =====
        String[] columns = {"Название", "Автор", "Жанр", "Год", "Статус"};

        Object[][] data = {
                {"1984", "Джордж Оруэлл", "Антиутопия", 1949, "В наличии"},
                {"Мастер и Маргарита", "М. Булгаков", "Роман", 1967, "Выдана"},
                {"Преступление и наказание", "Ф. Достоевский", "Классика", 1866, "В наличии"}
        };

        JTable table = new JTable(data, columns);
        table.setRowHeight(28);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        table.setSelectionBackground(new Color(200, 220, 255));

        JScrollPane scrollPane = new JScrollPane(table);

        // ===== Кнопки =====
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(245, 248, 255));

        JButton addBtn = createButton("Добавить");
        JButton editBtn = createButton("Редактировать");
        JButton deleteBtn = createButton("Удалить");

        buttonPanel.add(addBtn);
        buttonPanel.add(editBtn);
        buttonPanel.add(deleteBtn);

        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setFocusPainted(false);
        button.setBackground(new Color(220, 230, 250));
        return button;
    }
}