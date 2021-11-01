/*Создайте приложение для поиска абонента телефонной сети.
Список абонентов (5 записей) создается в программе и
является объектом класса TreeMap. Ключом записи является
номер телефона (типа String), а значением – объект Abonent,
содержащий четыре значения типа String: фамилию, имя,
отчество и адрес. Предусмотреть возможность сортировки
элементов коллекции по 2-3 полям.*/

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String []args){

        Map<String, Abonent> phoneBook = new TreeMap<>();

        phoneBook.put("+380505007020", new Abonent("B", "C", "P", "address"));
        phoneBook.put("+380505007021", new Abonent("B", "A", "P", "address"));
        phoneBook.put("+380505007022", new Abonent("D", "B", "P", "address"));
        phoneBook.put("+380505007023", new Abonent("B", "B", "P", "address"));
        phoneBook.put("+380505007024", new Abonent("A", "B", "P", "address"));

        System.out.println("Список контактов");
        PrintMap(phoneBook);

        Map<String, Abonent> sortedPhoneBook = sortByValues(phoneBook);
        System.out.println("Отсортированый список контактов");
        PrintMap(sortedPhoneBook);

        System.out.println("Поиск абонента по номеру телефона");
        System.out.println(FindPhoneBook(phoneBook, "+380502003040"));
        System.out.println(FindPhoneBook(phoneBook, "+380505007022"));

    }

    public static String FindPhoneBook(Map<String, Abonent> map, String findNumber) {
        String result;
        if (map.containsKey(findNumber)){
            result = map.get(findNumber).toString();
        }
        else {
            result = "Абонент не найден";
        }
        return result;
    }

    public static  Map<String, Abonent> sortByValues(final Map<String, Abonent> map) {
        Comparator<String> valueComparator = new Comparator<>() {
            public int compare(String k1, String k2) {
                int compare = map.get(k1).get_surname().compareTo(map.get(k2).get_surname());
                if (compare == 0) {
                    compare =  map.get(k1).get_name().compareTo(map.get(k2).get_name());
                }
                return compare;
            }
        };
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

    static class PersonComparator implements Comparator<QueuePerson> {

        @Override
        public int compare(QueuePerson a, QueuePerson b) {
            return Integer.compare(a.get_priority(), b.get_priority());
        }
    }
}
