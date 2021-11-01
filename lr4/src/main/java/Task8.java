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

import java.util.Comparator;
import java.util.LinkedList;

public class Task8 {
    public static void main(String []args){
        LinkedList<QueuePerson> queue = new LinkedList<>();
        queue.add(new QueuePerson("C", new AddressValue("c", "s", "5", 1), 3));
        queue.add(new QueuePerson("B", new AddressValue("c", "s", "5", 0), 2));
        queue.add(new QueuePerson("G", new AddressValue("c", "s", "5", 1), 5));
        queue.add(new QueuePerson("D", new AddressValue("c", "s", "5", 0), 4));
        queue.add(new QueuePerson("A", new AddressValue("c", "s", "5", 1), 1));
        queue.sort(new PersonComparator());
        System.out.println("Списк очередников: ");
        PrintList(queue);

        System.out.println("Добавление очередника: ");
        AddQueuePerson(queue, new QueuePerson("F", new AddressValue("c", "s", "5", 1), 0));
        PrintList(queue);
    }


    public static void PrintList(LinkedList<QueuePerson> list) {
        for(QueuePerson person : list){
            System.out.println(person.toString());
        }
    }

    public static void AddQueuePerson(LinkedList<QueuePerson> list, QueuePerson person) {
        QueuePerson lastPerson = list.get(list.size() - 1);
        person.set_priority(lastPerson.get_priority() + 1);
        list.add(person);
    }

    static class PersonComparator implements Comparator<QueuePerson> {

        @Override
        public int compare(QueuePerson a, QueuePerson b) {
            return Integer.compare(a.get_priority(), b.get_priority());
        }
    }
}
