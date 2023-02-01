package homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class homework3 {
    public static void main(String[] args) {
        // 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> list = new ArrayList();
        list.add("Черный");
        list.add("Синий");
        list.add("Белый");
        list.add("Коричневый");
        list.add("Серый");
        list.add("Зеленый");
        System.out.println(list);

        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        for (int i = 0; i < list.size(); i++) {
//            System.out.println((list.get(i).toString()) + "!");
        }

        // 3. Вставить элемент в список в первой позиции.
        list.add(0, "Красный");
//        System.out.println(list);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
//        System.out.println(list.remove(5));

        // 5. Обновить определенный элемент списка по заданному индексу.
        list.set(1, "Чёрный");
        list.set(5, "Зелёный");
//        System.out.println(list);

        // 6. Удалить третий элемент из списка.
        list.removeAll(list.subList(2, 3));
//        System.out.println(list);

        // 7. Поиска элемента в списке по строке.
//        System.out.println(list.indexOf("Белый"));

        // Создать новый список и добавить в него несколько элементов первого списка.
        ArrayList<String> list1 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "Чёрный" || list.get(i) == "Белый") {
                list1.add(list.get(i));
            }
        }
//        System.out.println(list1);

        // 8. Удалить из первого списка все элементы отсутствующие во втором списке.
        list.retainAll(list1);
//        System.out.println(list);

        // 9. *Сортировка списка.
        Collections.sort(list);
//        System.out.println(list);

    }
}
