/*Создайте приложение для поиска абонента телефонной сети.
Список абонентов (5 записей) создается в программе и
является объектом класса TreeMap. Ключом записи является
номер телефона (типа String), а значением – объект Abonent,
содержащий четыре значения типа String: фамилию, имя,
отчество и адрес. Предусмотреть возможность сортировки
элементов коллекции по 2-3 полям.*/

import java.util.*;

public class Task2 {

    public static void main(String []args){

        Map<String, Abonent> phoneBook = EnterPhoneBook();
        PrintMap(phoneBook);

        Map<String, Abonent> sortedPhoneBook = sortByValues(phoneBook);
        System.out.println("Отсортированый список контактов");
        PrintMap(sortedPhoneBook);

        System.out.println("Поиск абонента по номеру телефона");
        String findNumber = GetPhoneNumber();
        FindPhoneBook(phoneBook, findNumber);

    }

    public static void FindPhoneBook(Map<String, Abonent> map, String findNumber) {
        if (map.containsKey(findNumber)){
            System.out.println(map.get(findNumber).toString());
        }
        else {
            System.out.println("Абонент не найден");
        }
    }

    public static  Map<String, Abonent> sortByValues(final Map<String, Abonent> map) {
        Comparator<String> valueComparator = Comparator.comparing((String k) -> map.get(k).surname).thenComparing(k -> map.get(k).name);
        Map<String, Abonent> sortedByValues = new TreeMap<>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public static void PrintMap(Map<String, Abonent> map) {
        for(Map.Entry<String, Abonent> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue().toString());
        }
        System.out.println();
    }

    public static TreeMap<String, Abonent> EnterPhoneBook() {
        Scanner in = new Scanner(System.in);
        TreeMap<String, Abonent> result = new TreeMap<>();

        System.out.print("Введите количество телефонных абонентов ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите количество телефонных абонентов ");
            in.next();
        }
        int n = in.nextInt();

        for (int i = 0; i < n; i ++) {
            String number = GetPhoneNumber();
            Abonent inform = GetAbonentInform();
            result.put(number, inform);
        }
        return result;
    }

    public static String GetPhoneNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер телефона ");
        while (!in.hasNext("\\+380\\d{9}")) {
            System.out.println("Неправильный формат номера телефона");
            System.out.print("Введите номер телефона ");
            in.nextLine();
        }
        return in.nextLine();
    }

    public static Abonent GetAbonentInform() {
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Введите ФИО ");
            input = in.nextLine();
        } while (!input.matches("([A-ZА-Я][a-zа-я]+\\s){2}[A-ZА-Я][a-zа-я]+"));
        String[] tempArr = input.split(" ");

        System.out.print("Введите адрес ");
        String address = in.nextLine();

        return new Abonent(tempArr[0], tempArr[1], tempArr[2], address);
    }

    static class Abonent {
        String surname, name, patronymic, address;

        public Abonent(String surname, String name, String patronymic, String address) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.address = address;
        }

        @Override
        public String toString() {
            return surname + " " + name + " " + patronymic + ", адрес " + address;
        }
    }
}
