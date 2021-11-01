/*Создайте приложение для просмотра, добавления и удаления
элементов списка студентов. Список (5 элементов) создается в
программе и является объектом класса ArrayList. Каждый
элемент списка содержит фамилию, имя и отчество (ФИО)
студента (типа String), имя группы (типа String), дату
рождения (типа BirthDate) и среднюю оценку за прошедшую
сессию (типа float). Объект класса BirthDate в свою очередь
содержит три элемента типа int (год, номер месяца и день
рождения).
*/

import java.util.*;

public class Task28 {

    public static void main(String []args){
        ArrayList<Student> students = EnterStudentsBook();
        PrintStudentsList(students);

        AddStudentsList(students);
        PrintStudentsList(students);

        DelStudentsList(students);
        PrintStudentsList(students);
    }

    public static void PrintStudentsList(ArrayList<Student> list) {
        for (Student value : list) {
            System.out.println(value.toString());
        }
    }

    public static void AddStudentsList(ArrayList<Student> list) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество студентов, которых хотите добавить в список ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите количество студентов, которых хотите добавить в список ");
            in.next();
        }
        int n = in.nextInt();

        for (int i = 0; i < n; i ++) {
            list.add(GetStudentInformation());
        }
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

    public static ArrayList<Student> EnterStudentsBook() {
        ArrayList<Student> result = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество студентов ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите количество студентов ");
            in.next();
        }
        int n = in.nextInt();

        for (int i = 0; i < n; i ++) {
            Student student = GetStudentInformation();
            result.add(student);
        }
        return result;
    }

    public static Student GetStudentInformation(){
        Scanner in = new Scanner(System.in);

        float averageGrade;

        String fullName = GetFullName();
        String group = GetGroup();
        BirthDate date = GetBirthDate();

        System.out.print("Введите среднюю оценку за год ");
        while (!in.hasNextFloat()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите среднюю оценку за год ");
            in.next();
        }
        averageGrade = in.nextFloat();

        return new Student(fullName, group, date, averageGrade);
    }

    public static String GetFullName() {
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Введите ФИО ");
            input = in.nextLine();
        } while (!input.matches("([A-ZА-Я][a-zа-я]+\\s){2}[A-ZА-Я][a-zа-я]+"));
        return input;
    }

    public static String GetGroup() {
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Введите группу ");
            input = in.nextLine();
        } while (!input.matches("[A-ZА-ЯІ]{2}-\\d{2}"));
        return input;
    }

    public static BirthDate GetBirthDate() {
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Введите дату рождения ");
            input = in.nextLine();
        } while (!input.matches("[0-3]\\d[\\s./][01]\\d[\\s./][12]\\d{3}"));

        String[] tempArr =  input.split("[\\s./]+");
        int[] arr = new int[tempArr.length];
        for (int i = 0; i < tempArr.length; i++) {
            arr[i] =Integer.parseInt(tempArr[i]);
        }

        return (new BirthDate(arr[0], arr[1], arr[2]));
    }
}

