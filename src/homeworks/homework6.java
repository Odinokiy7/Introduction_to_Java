package homeworks;

import java.util.HashMap;

public class homework6 {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(9);
        mySet.add(5);
//        System.out.println(mySet);

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));
        }
    }

}

class MySet {
    private HashMap<Integer, Object> hashMap = new HashMap<>();
    private final Object OBJ = new Object();

    public boolean add(Integer i) {
        return hashMap.put(i, OBJ) != null ? true : false;
    }

    @Override
    public String toString() {
        return hashMap.keySet().toString();
    }

    public Integer size() {
        return hashMap.keySet().size();
    }

    public Integer get(Integer a) {
        return (Integer) hashMap.keySet().toArray()[a];
    }

}
