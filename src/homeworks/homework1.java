package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class homework1 {
    public static void main(String[] args) {
        Random number = new Random();
        int valueOf_i = number.nextInt(2000);
        System.out.printf("Наше случайное число i = %d\n", valueOf_i);
        String binary = Integer.toBinaryString(valueOf_i);
        System.out.println("В двоичной системе это число = " + binary);

        int valueOf_n = 0;
        for (int j = 0; j < binary.length(); j++) {
            ++valueOf_n;
        }
        valueOf_n -= 1;
        System.out.println("Номер старшего значащего бита n = " + valueOf_n);

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);


        ArrayList<Integer> arrayListMultiples = new ArrayList<>();
        for (int i = valueOf_i; i < Short.MAX_VALUE; i++) {
            if (i % valueOf_n == 0) {
                arrayListMultiples.add(i);
            }
        }
//        System.out.println(arrayList);

        int[] m1 = new int[arrayListMultiples.size()];
        for (int i = 0; i < arrayListMultiples.size(); i++) {
            m1[i] = arrayListMultiples.get(i);
        }
        System.out.println("Кратные n числа в диапазоне от i до Short.MAX_VALUE: " + Arrays.toString(m1) + "\n");


        ArrayList<Integer> arrayListNonMultiples = new ArrayList<>();
        for (int i = Short.MIN_VALUE; i < valueOf_i; i++) {
            if (i % valueOf_n != 0) {
                arrayListNonMultiples.add(i);
            }
        }
//        System.out.println(arrayListNonMultiples);

        int[] m2 = new int[arrayListNonMultiples.size()];
        for (int i = 0; i < arrayListNonMultiples.size(); i++) {
            m2[i] = arrayListNonMultiples.get(i);
        }
        System.out.println("Некратные n числа в диапазоне от Short.MIN_VALUE до i: " + Arrays.toString(m2) + "\n");
    }
}