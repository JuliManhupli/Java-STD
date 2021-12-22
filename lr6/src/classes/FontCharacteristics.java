package classes;

import java.awt.*;
import java.awt.event.*;


/***
 * FontCharacteristics class is a class for entering text and replacing its font and style
 */
public class FontCharacteristics extends Frame {

    /***
     * Constructor - creating a new object with specific values
     * @param title - form name
     */
    public FontCharacteristics(String title)  {
        super(title);
        setFont(new Font("Arial", Font.PLAIN, 18));
        setSize(600,400);
        setLocation(200,300);

        //Создание панели
        Panel panel = new Panel();
        Color c = new Color(230, 230, 250);
        panel.setBackground(c);
        panel.setLayout(null);

        add(BorderLayout.CENTER,panel);

        //создание надписи "Шрифт"
        Label font = new Label("Шрифт: ", Label.LEFT);
        font.setBounds(30, 25, 70, 30);

        panel.add(font);

        //ComboBox с шрифтами
        Choice fontComboBox = new Choice();
        fontComboBox.add("Serif");
        fontComboBox.add("Arial");
        fontComboBox.add("Monospaced");
        fontComboBox.setBounds(110, 25, 200, 30);

        panel.add(fontComboBox);

        //создание надписи "Стиль"
        Label style = new Label("Стиль: ", Label.LEFT);
        style.setBounds(320, 25, 60, 30);

        panel.add(style);

        //ComboBox с стилями
        Choice styleComboBox = new Choice();
        styleComboBox.add("Простой");
        styleComboBox.add("Жирный");
        styleComboBox.add("Курсив");
        styleComboBox.add("Жирный курсив");
        styleComboBox.setBounds(390, 25, 150, 30);

        panel.add(styleComboBox);

        //текстовое полe
        TextArea  textArea  = new TextArea (3, 20);
        textArea.setText("Введите текст");
        textArea.setBounds(50, 70, 500, 90);


        panel.add(textArea);

        //кнопка
        Button button = new Button("Стилизация текста");
        button.setBounds(200, 200, 200, 30);

        panel.add(button);

        //вывод
        Label text = new Label();
        text.setBounds(50, 250, 500, 30);

        panel.add(text);

        setVisible(true);//візуалізація форми

        //Обробник для закривання форми
        addWindowListener(new WindowAdapter() {
            /***
             * Function for closing a form
             * @param e - WindowEvent
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            /***
             * Functions for pressing a button to change text, font and style
             * @param e - action button click
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String font = fontComboBox.getSelectedItem();
                String style = styleComboBox.getSelectedItem();

                switch (style) {
                    case "Простой" -> text.setFont(new Font(font, Font.PLAIN, 18));
                    case "Жирный" -> text.setFont(new Font(font, Font.BOLD, 18));
                    case "Курсив" -> text.setFont(new Font(font, Font.ITALIC, 18));
                    case "Жирный курсив" -> text.setFont(new Font(font, Font.BOLD + Font.ITALIC, 18));
                }

                text.setText(textArea.getText());
            }
        });
    }
}
