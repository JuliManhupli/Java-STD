import classes.FontCharacteristics;
/*Ввод текста в графическое окно приложения. В верхней панели (JPanel) окна "Характеристики шрифта" определены
следующие компоненты: надпись (JLabel) "Шрифт:", раскрывающееся меню  (JComboBox), в котором три пункта:
"Times New Roman" (шрифт по умолчанию),  "Arial" и "Verdana",  надпись (JLabel) "Стиль:" и раскрывающееся
меню (JComboBox),  в котором четыре пункта: "Простой" (шрифт по умолчанию),  "Жирный", "Курсив" и "Жирный курсив".
В нижней текстовой панели (JTextPane) "Ввод текста" окна приложения вводится текст, набираемый на клавиатуре. При
выборе одного из пунктов меню текст в панели выводится соответствующим шрифтом и/или соответствующего стиля.
 */


public class task2 {
    public static void main(String[] args) {
        //Сценарій роботи
        new FontCharacteristics("Задание 2, Характеристики шрифта");//відкрити форму

    }
}
