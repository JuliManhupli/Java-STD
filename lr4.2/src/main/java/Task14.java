/*Создайте приложение для удаления абонента и просмотра
списка абонентов телефонной сети. Список абонентов (5
записей) создается в программе и является объектом класса
HashMap. Ключом записи является номер телефона (типа
Integer), а значением – объект Abonent, содержащий четыре
значения типа String: фамилию, имя, отчество и адрес.
Предусмотреть возможность сортировки по фамилии с
помощью TreeMap.*/

import java.util.*;

public class Task14 {

    public static void main(String []args){
        Map<String, Abonent> phoneBook = EnterPhoneBook();
        PrintMap(phoneBook);
        DelPhoneBook(phoneBook);
        PrintMap(phoneBook);
        TreeMap<Abonent, String> sortedPhoneBook = SortMap(phoneBook);
        System.out.println("Отсортированый список");
        for(Map.Entry<Abonent, String> pair : sortedPhoneBook.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey().toString());
        }
    }

    public static TreeMap<Abonent, String> SortMap(Map<String, Abonent> map){
        Map<Abonent, String> mapRev = Reverse(map);
        TreeMap<Abonent, String> result = new TreeMap<>(new SortSurname());
        result.putAll(mapRev);
        return result;
    }

    public static void PrintMap(Map<String, Abonent> map) {
        for(Map.Entry<String, Abonent> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue().toString());
        }
    }

    public static void DelPhoneBook(Map<String, Abonent> map) {
        System.out.println("Удаление абонента");
        String delete = GetPhoneNumber();
        map.remove(delete);
    }

    public static HashMap<String,Abonent> EnterPhoneBook() {
        Scanner in = new Scanner(System.in);
        HashMap<String, Abonent> result = new HashMap<>();

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

        public String GetSurname(){
            return surname;
        }

        @Override
        public String toString() {
            return surname + " " + name + " " + patronymic + ", адрес " + address;
        }
    }

    static class SortSurname implements Comparator<Abonent>{

        @Override
        public int compare(Abonent e1, Abonent e2) {
            return e1.GetSurname().compareTo(e2.GetSurname());
        }
    }

    public static <K,V> HashMap<V, K> Reverse(Map<K, V> map) {
        HashMap<V, K> rev = new HashMap<>();
        for(Map.Entry<K, V> entry : map.entrySet())
            rev.put(entry.getValue(), entry.getKey());
        return rev;
    }
}
