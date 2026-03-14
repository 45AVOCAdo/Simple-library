package code;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Электронная библиотека");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(245, 248, 255));
        setLayout(new BorderLayout(20, 20));

        JLabel title = new JLabel("Электронная Библиотека", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setBorder(new EmptyBorder(30, 0, 10, 0));

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        buttonPanel.setBorder(new EmptyBorder(20, 60, 40, 60));
        buttonPanel.setBackground(new Color(245, 248, 255));

        JButton catalogBtn = createButton("Каталог книг");
        JButton readersBtn = createButton("Читатели");
        JButton issueBtn = createButton("Выдача книг");
        JButton exitBtn = createButton("Выход");

        catalogBtn.addActionListener(e -> new CatalogWindow());
        exitBtn.addActionListener(e -> System.exit(0));

        buttonPanel.add(catalogBtn);
        buttonPanel.add(readersBtn);
        buttonPanel.add(issueBtn);
        buttonPanel.add(exitBtn);

        add(title, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        button.setFocusPainted(false);
        button.setBackground(new Color(220, 230, 250));
        button.setPreferredSize(new Dimension(200, 60));
        return button;
    }
}