/*Создайте приложение для просмотра, добавления и удаления
элементов списка студентов. Список (5 элементов) создается в
программе и является объектом класса ArrayList. Каждый
элемент списка содержит фамилию, имя и отчество (ФИО)
студента (типа String), имя группы (типа String), дату
рождения (типа BirthDate) и среднюю оценку за прошедшую
сессию (типа float). Объект класса BirthDate в свою очередь
содержит три элемента типа int (год, номер месяца и день
рождения).*/

import java.util.ArrayList;
import java.util.Scanner;

public class Task28 {
    public static void main(String []args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("First student ", "TI", new BirthDate(10, 12, 2000), 20));
        students.add(new Student("Second student ", "TI", new BirthDate(11, 12, 2000), 21));
        students.add(new Student("Third student ", "TI", new BirthDate(12, 12, 2000), 22));
        students.add(new Student("Fourth student ", "TI", new BirthDate(13, 12, 2000), 23));
        students.add(new Student("Fifth student ", "TI", new BirthDate(14, 12, 2000), 24));
        System.out.println("Список:");
        PrintStudentsList(students);

        System.out.println("Добавление студента:");
        AddStudentsList(students, new Student("Sixth student ", "TI", new BirthDate(15, 12, 2000), 25));
        PrintStudentsList(students);

        System.out.println("Удаление студента:");
        DelStudentsList(students);
        PrintStudentsList(students);
    }

    public static void PrintStudentsList(ArrayList<Student> list) {
        for (Student value : list) {
            System.out.println(value.toString());
        }
    }

    public static void AddStudentsList(ArrayList<Student> list, Student student) {
        list.add(student);
    }

    public static void DelStudentsList(ArrayList<Student> list) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс студента, которого нужно удалить из списка ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите индекс студента, которого нужно удалить из списка ");
            in.next();
        }
        list.remove(in.nextInt());
    }
}
