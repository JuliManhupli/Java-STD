package classes;

import java.awt.*;
import java.awt.event.*;


/***
 * Class for drawing a triangle
 */
public class Triangle extends Panel {
    /** Field of the variable check to test the button press */
    public boolean check;
    /** Field of the variable x1List to choice of coordinate x1 */
    List x1List = new List(100);
    /** Field of the variable x2List to choice of coordinate x2 */
    List x2List = new List(100);
    /** Field of the variable x3List to choice of coordinate x3 */
    List x3List = new List(100);
    /** Field of the variable y1List to choice of coordinate y1 */
    List y1List = new List(100);
    /** Field of the variable y2List to choice of coordinate y2 */
    List y2List = new List(100);
    /** Field of the variable y3List to choice of coordinate y3 */
    List y3List = new List(100);

    /***
     *Constructor - creating a new object with specific values
     * @param title - form name
     */
    public Triangle(String title)  {
        Frame frame = new Frame(title);

        frame.setSize(600,400);
        frame.setLocation(100,100);

        //Создание панели
        Panel panel = new Panel();
        Color c = new Color(215, 229, 247);
        panel.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.setBounds(0, 0, 600, 120);
        panel.setBackground(c);
        panel.setLayout(null);

        frame.add(BorderLayout.NORTH,panel);

        //Создание панели
        this.setFont(new Font("Arial", Font.PLAIN, 16));
        this.setBounds(0, 150, 600, 230);
        this.setBackground(c);
        this.setLayout(null);

        frame.add(BorderLayout.SOUTH,this);

        //создание надписи "Координаты вершин треугольника"
        Label nameCoordinates = new Label("Координаты вершин треугольника: ", Label.LEFT);
        nameCoordinates.setBounds(15, 5, 300, 30);

        panel.add(nameCoordinates);

        //создание надписи "X1"
        Label x1Label = new Label("X1: ", Label.LEFT);
        x1Label.setBounds(20, 45, 40, 30);

        panel.add(x1Label);

        //создание надписи "X2"
        Label x2Label = new Label("X2: ", Label.LEFT);
        x2Label.setBounds(115, 45, 40, 30);

        panel.add(x2Label);

        //создание надписи "X3"
        Label x3Label = new Label("X3: ", Label.LEFT);
        x3Label.setBounds(210, 45, 40, 30);

        panel.add(x3Label);

        //создание надписи "Y1"
        Label y1Label = new Label("Y1: ", Label.LEFT);
        y1Label.setBounds(20, 75, 40, 30);

        panel.add(y1Label);

        //создание надписи "Y2"
        Label y2Label = new Label("Y2: ", Label.LEFT);
        y2Label.setBounds(115, 75, 40, 30);

        panel.add(y2Label);

        //создание надписи "Y3"
        Label y3Label = new Label("Y3: ", Label.LEFT);
        y3Label.setBounds(210, 75, 40, 30);

        panel.add(y3Label);

        //списки
        x1List.setBounds(60, 45, 50, 30);
        x2List.setBounds(155, 45, 50, 30);
        x3List.setBounds(250, 45, 50, 30);

        y1List.setBounds(60, 75, 50, 30);
        y2List.setBounds(155, 75, 50, 30);
        y3List.setBounds(250, 75, 50, 30);

        for (int i = 0; i <= 100; i++) {
            x1List.add(String.valueOf(i));
            x2List.add(String.valueOf(i));
            x3List.add(String.valueOf(i));

            y1List.add(String.valueOf(i));
            y2List.add(String.valueOf(i));
            y3List.add(String.valueOf(i));
        }
        panel.add(x1List);
        panel.add(x2List);
        panel.add(x3List);

        panel.add(y1List);
        panel.add(y2List);
        panel.add(y3List);

        //кнопка
        Button button = new Button("Вывести треугольник");
        button.setBounds(330, 75, 200, 30);

        panel.add(button);

        //создание надписи "Вывод треугольника"
        Label nameTriangle = new Label("Вывод треугольника", Label.LEFT);
        nameTriangle.setBounds(15, 20, 200, 30);

        this.add(nameTriangle);

        frame.setVisible(true);//візуалізація форми
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
     * Graphics window for drawing a triangle
     * @param g - graphics
     */
    public void paint(Graphics g) {
        super.paint(g);

        if (check && x1List.getSelectedItem() != null  && x2List.getSelectedItem() != null
                && x3List.getSelectedItem() != null  && y1List.getSelectedItem() != null
                && y2List.getSelectedItem() != null && y3List.getSelectedItem() != null) {
            int x1 = Integer.parseInt(x1List.getSelectedItem());
            int x2 = Integer.parseInt(x2List.getSelectedItem());
            int x3 = Integer.parseInt(x3List.getSelectedItem());

            int y1 = Integer.parseInt(y1List.getSelectedItem());
            int y2 = Integer.parseInt(y2List.getSelectedItem());
            int y3 = Integer.parseInt(y3List.getSelectedItem());
            int [] x = {x1 + 50, x2 + 50, x3 + 50};
            int [] y = {y1 + 70, y2 + 70, y3 + 70};
            g.fillPolygon(x, y, 3);
        }

    }


}
