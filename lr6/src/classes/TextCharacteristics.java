package classes;


import java.awt.*;
import java.awt.event.*;


/***
 * TextCharacteristics class contains a form for entering text and a
 * menu for changing the color and size of the text
 */
public class TextCharacteristics extends Frame {

    /***
     *Constructor - creating a new object with specific values
     * @param title - form name
     */
    public TextCharacteristics(String title)  {
        super(title);
        setSize(400,350);
        setLocation(200,300);
        setFont(new Font("Arial", Font.PLAIN, 16));

        //Создание панели
        MenuBar menu = new MenuBar();

        setMenuBar(menu);

        //меню цвета
        Menu color = new Menu("Цвет шрифта");

        //элементы вкладки цвет
        MenuItem black = new MenuItem("Черный");
        MenuItem red = new MenuItem("Красный");
        MenuItem green = new MenuItem("Зеленый");
        color.add(black);
        color.add(red);
        color.add(green);

        menu.add(color);

        //меню размер
        Menu size = new Menu("Размер");

        //элементы вкладки цвет
        MenuItem s12pt = new MenuItem("12");
        MenuItem s14pt = new MenuItem("14");
        MenuItem s16pt = new MenuItem("16");
        size.add(s12pt);
        size.add(s14pt);
        size.add(s16pt);

        menu.add(size);

        //Создание панели
        Panel panel = new Panel();
        Color c = new Color(255, 243, 217);
        panel.setBackground(c);
        panel.setLayout(null);

        add(BorderLayout.CENTER,panel);

        //текстовое полe
        TextArea textArea = new TextArea(2, 25);
        textArea.setText("Введите текст");
        textArea.setBounds(15, 30, 370, 70);

        panel.add(textArea);

        //вывод
        Label text = new Label();
        text.setBounds(15, 120, 370, 30);
        text.setFont(new Font("Arial", Font.PLAIN, 12));

        panel.add(text);

        setVisible(true);//візуалізація форми

        color.addActionListener(new ActionListener() {
            /***
             * Function to change color
             * @param e - selected in the menu
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorText = e.getActionCommand();
                Color g = new Color(0, 168, 107);
                switch (colorText) {
                    case "Черный" -> text.setForeground(Color.BLACK);
                    case "Красный" -> text.setForeground(Color.RED);
                    case "Зеленый" -> text.setForeground(g);
                }
                text.setText(textArea.getText());
            }
        });

        size.addActionListener(new ActionListener() {
            /***
             * Function to change size of the text
             * @param e - selected in the menu
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int sizeText =  Integer.parseInt(e.getActionCommand());
                text.setFont(new Font("Arial", Font.PLAIN, sizeText));
                text.setText(textArea.getText());
            }
        });
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
    }
}