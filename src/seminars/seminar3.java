package seminars;

import java.util.*;

public class seminar3 {
    public static void main(String[] args) {
        int a = 0;
        ArrayList<String> list = new ArrayList<>();
        list.add("HelloWorld!");
        list.add("Hello!");
        list.add("World!");
        list.add("HW!");
        list.add(list.size() / 2, "World of Java!");
        list.set(2, "Java!");
        a = list.size();
        list.remove(a - 1);
//        System.out.println(list.remove("Java!"));

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
        }

        for (String str : list) {
//            System.out.println(str);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
//            System.out.println(str);
//            iterator.remove();
        }

        ListIterator<String> listIterator = list.listIterator(list.size() / 2);
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
//            System.out.println(str);
//            listIterator.remove();
        }

//        list.forEach( (k) -> System.out.println(k) );

        System.out.println(list);

        System.out.println(list.indexOf("Java!"));
        list.lastIndexOf("Java!");

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            l1.add(rnd.nextInt(8));
            l2.add(rnd.nextInt(8));
        }

        System.out.println(l1);
        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return (t1 % 3 == 0 && t0 % 3 == 0) ? 0 : (t1 % 3 != 0 && t0 % 3 == 0) ? 1 : -1;
            }
        });

//        Collections.sort(l1);
        System.out.println(l1);

//        l1.removeAll(l2);
//        l1.retainAll(l2);
//        System.out.println(l1);

        String[] sArray = new String[list.size()];
        list.toArray(sArray);
    }
}
