package classes;

import java.awt.*;
import java.awt.event.*;

/***
 * ChangeLabel class for displaying the label and changing the color and size
 */
public class ChangeLabel extends Panel {
    /** Field of the variable check to test the button press */
    public boolean check;
    /** Field of the variable textField to text input */
    TextField textField = new TextField("Введите текст", 20);
    /** Field of the variable color to select text color */
    List color = new List(4,false);
    /** Field of the variable size to select text size */
    List size = new List(4,false);
    /** Field of the variable coordinateXText to output coordinate X */
    TextField coordinateXText = new TextField("100", 20);
    /** Field of the variable coordinateYText to output coordinate Y */
    TextField coordinateYText = new TextField("100", 20);

    /***
     * Constructor - creating a new object with specific values
     * @param title - form name
     */
    public ChangeLabel(String title)  {
        Frame frame = new Frame(title);

        frame.setSize(775,600);
        frame.setLocation(100,100);

        //Создание панели
        Color c = new Color(255, 230, 222);
        this.setBounds(0, 0, 775, 400);
        this.setBackground(c);
        this.setLayout(null);

        frame.add(BorderLayout.NORTH,this);

        //Создание панели
        Panel panel = new Panel();
        panel.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.setBackground(c);
        panel.setBounds(0, 450, 775, 150);
        panel.setLayout(null);

        frame.add(panel, BorderLayout.SOUTH);

        //создание надписи "Текст"
        Label textLabel = new Label("Текст: ", Label.LEFT);
        textLabel.setBounds(15, 20, 60, 30);

        panel.add(textLabel);

        //текстовое полe
        textField.setBounds(75, 20, 200, 30);

        panel.add(textField);

        //создание надписи "Цвет"
        Label colorLabel = new Label("Цвет: ", Label.LEFT);
        colorLabel.setBounds(290, 20, 50, 30);

        panel.add(colorLabel);

        //список с цветами
        color.setBounds(350, 20, 150, 30);
        color.add("Черный");
        color.add("Красный");
        color.add("Зеленый");
        color.add("Синий");

        panel.add(color);

        //создание надписи "Размер"
        Label sizeLabel = new Label("Размер: ", Label.LEFT);
        sizeLabel.setBounds(510, 20, 70, 30);

        panel.add(sizeLabel);

        //список с размерами
        size.setBounds(600, 20, 150, 30);
        size.add("10pt");
        size.add("12pt");
        size.add("14pt");
        size.add("16pt");

        panel.add(size);

        //создание надписи "Координата X"
        Label coordinateX = new Label("Координата X: ", Label.LEFT);
        coordinateX.setBounds(15, 60, 110, 30);

        panel.add(coordinateX);

        //текстовое полe
        coordinateXText.setEditable(false);
        coordinateXText.setBounds(140, 60, 100, 30);

        panel.add(coordinateXText);

        //создание надписи "Координата Y"
        Label coordinateY = new Label("Координата Y: ", Label.LEFT);
        coordinateY.setBounds(250, 60, 110, 30);

        panel.add(coordinateY);

        //текстовое полe
        coordinateYText.setEditable(false);
        coordinateYText.setBounds(370, 60, 100, 30);

        panel.add(coordinateYText);

        //кнопка
        Button button = new Button("Вывести строку");
        button.setBounds(550, 60, 150, 30);

        panel.add(button);

        frame.setVisible(true);

        //Обробник для закривання форми
        frame.addWindowListener(new WindowAdapter() {
            /***
             * Function for closing a form
             * @param e - WindowEvent
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.addMouseListener(new MouseAdapter() {
            /***
             * Function for reading coordinates on mouse click
             * @param e - mouse click
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                coordinateXText.setText(String.valueOf(e.getX()));
                coordinateYText.setText(String.valueOf(e.getY()));
                repaint();
            }
        });

        button.addActionListener(new ActionListener() {
            /***
             * Function for press a button and change text parameters
             * @param e - press a button
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                check=true;
                repaint();
            }

        });

    }

    /***
     * Graphics window for drawing a lettering
     * @param g - graphics
     */
    public void paint(Graphics g) {
        super.paint(g);
        String text = textField.getText();

        String x = coordinateXText.getText();
        String y = coordinateYText.getText();
        g.setFont(new Font("Arial", Font.PLAIN, 12));

        if (check) {
            Color green = new Color(0, 168, 107);

            if (color.getSelectedItem() != null) {
                switch (color.getSelectedItem()) {
                    case "Черный" -> g.setColor(Color.BLACK);
                    case "Красный" -> g.setColor(Color.RED);
                    case "Зеленый" -> g.setColor(green);
                    case "Синий" -> g.setColor(Color.BLUE);
                }
            }

            if (size.getSelectedItem() != null) {
                switch (size.getSelectedItem()) {
                    case "10pt" -> g.setFont(new Font("Arial", Font.PLAIN, 10));
                    case "12pt" -> g.setFont(new Font("Arial", Font.PLAIN, 12));
                    case "14pt" -> g.setFont(new Font("Arial", Font.PLAIN, 14));
                    case "16pt" -> g.setFont(new Font("Arial", Font.PLAIN, 16));
                }
            }

        }
        g.drawString(text, Integer.parseInt(x), Integer.parseInt(y));
    }
}
