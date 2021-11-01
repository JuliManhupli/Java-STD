/*Создайте приложение для удаления абонента и просмотра
списка абонентов телефонной сети. Список абонентов (5
записей) создается в программе и является объектом класса
HashMap. Ключом записи является номер телефона (типа
String), а значением – объект Abonent, содержащий четыре
значения типа String: фамилию, имя, отчество и адрес.
Предусмотреть возможность сортировки по фамилии с
помощью TreeMap.*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task14 {
    public static void main(String []args){
        Map<String, Abonent> phoneBook = new HashMap<>();

        phoneBook.put("+380505007020", new Abonent("D", "C", "P", "address"));
        phoneBook.put("+380505007021", new Abonent("B", "A", "P", "address"));
        phoneBook.put("+380505007022", new Abonent("G", "B", "P", "address"));
        phoneBook.put("+380505007023", new Abonent("C", "B", "P", "address"));
        phoneBook.put("+380505007024", new Abonent("A", "B", "P", "address"));
        PrintMap(phoneBook);

        DelPhoneBook(phoneBook, "+380505007024");
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

    public static void DelPhoneBook(Map<String, Abonent> map, String delete) {
        System.out.println("Удаление абонента");
        map.remove(delete);
    }

    public static HashMap<Abonent, String> Reverse(Map<String, Abonent> map) {
        HashMap<Abonent, String> rev = new HashMap<>();
        for(Map.Entry<String, Abonent> entry : map.entrySet())
            rev.put(entry.getValue(), entry.getKey());
        return rev;
    }

    static class SortSurname implements Comparator<Abonent> {

        @Override
        public int compare(Abonent e1, Abonent e2) {
            return e1.get_surname().compareTo(e2.get_surname());
        }
    }
}
