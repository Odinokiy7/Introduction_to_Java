package seminars;

import java.util.ArrayList;
import java.util.Random;

public class seminar3_task1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Один");
        str.add("Два");
        str.add("Три");
        str.add("Четыре");
        str.add("Пять");

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < str.size(); i++) {
            numbers.add(rnd.nextInt(6) + 1); // Рандомные числа от 1 до 6
        }

        System.out.println(str);
        System.out.println(numbers);

        ArrayList<String> str2 = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            if (!(str.get(i).length() > numbers.get(i))) {
                str2.add(str.get(i));
            }
        }
        System.out.println(str2);

        for (int i = str.size() - 1; i > 0; i--) {
            if (str.get(i).length() > numbers.get(i)) {
                str.remove(i);
            }
        }
        System.out.println(str);
    }
}