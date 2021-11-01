/*Создайте приложение для просмотра списка очередников и
изменения приоритета очередников в очереди. Список (5
записей) создается в программе и является объектом класса
LinkedList. Запись списка является объектом QueuePerson,
содержащим поля фамилии, имени и отчества очередника
(типа String), поле типа AddressValue для адреса очередника и
приоритет очередника (типа int). В свою очередь, поле типа
AddressValue содержит три поля типа String: наименование
города, наименование улицы и номер дома, а также поле типа
int – номер квартиры (если номер квартиры равен 0, дом, в
котором проживает очередник, не имеет квартир). Записи в
очереди сортируются в соответствии с приоритетом, и
очередник добавляется последним в очереди приоритета.*/

import java.util.*;

public class Task8 {

    public static void main(String []args){
        LinkedList<QueuePerson> queue = EnterQueue();
        PrintList(queue);
        AddQueuePerson(queue);
        PrintList(queue);
    }

    public static void PrintList(LinkedList<QueuePerson> list) {
        for(QueuePerson person : list){
            System.out.println(person.toString());
        }
    }

    public static void AddQueuePerson(LinkedList<QueuePerson> list) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество человек, которых хотите добавить в список ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите количество студентов, которых хотите добавить в список ");
            in.next();
        }
        int n = in.nextInt();

        for (int i = 0; i < n; i ++) {
            QueuePerson person = GetQueuePerson();
            QueuePerson lastPerson = list.get(list.size() - 1);
            person.priority = lastPerson.priority + 1;
            list.add(person);
        }
    }

    public static LinkedList<QueuePerson> EnterQueue() {
        Scanner in = new Scanner(System.in);
        LinkedList<QueuePerson> result = new LinkedList<>();

        System.out.print("Введите количество человек в очереди ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите количество человек в очереди ");
            in.next();
        }
        int n = in.nextInt();

        for (int i = 0; i < n; i ++) {
            QueuePerson inform = GetQueuePerson();
            result.add(inform);
        }

        result.sort(Comparator.comparingInt(o -> o.priority));

        return result;
    }

    public static QueuePerson GetQueuePerson() {
        Scanner in = new Scanner(System.in);
        String name;
        do {
            System.out.print("Введите ФИО ");
            name = in.nextLine();
        } while (!name.matches("([A-ZА-Я][a-zа-я]+\\s){2}[A-ZА-Я][a-zа-я]+"));


        System.out.print("Введите город, улицу, номер дома и квартиры ");
        String[] tempArr =  in.nextLine().split(" ");
        AddressValue address = new AddressValue(tempArr[0], tempArr[1], tempArr[2],  Integer.parseInt(tempArr[3]));


        System.out.print("Введите приоритет ");
        while (!in.hasNextInt()) {
            System.out.println("Входные данные должны быть цифрами");
            System.out.print("Введите приоритет ");
            in.nextLine();
        }
        int prior = in.nextInt();

        return new QueuePerson(name, address, prior);
    }

    static class QueuePerson {
        String fullName;
        AddressValue address;
        int priority;

        public QueuePerson(String fullName, AddressValue address, int priority) {
            this.fullName = fullName;
            this.address = address;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return fullName + ", адрес " + address + ", приоритет " + priority;
        }
    }

    static class AddressValue {
        String city, street, house;
        int flat;

        public AddressValue(String city, String street, String house, int flat) {
            this.city = city;
            this.street = street;
            this.house = house;
            this.flat = flat;
        }

        @Override
        public String toString() {
            if (flat == 0) {
                return "г " + city + ", ул " + street + " " + house;
            }
            else return "г " + city + ", ул " + street + " " + house + ", кв  " + flat;
        }
    }
}
