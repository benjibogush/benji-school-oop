package school.utilities;

// Some generic basics <E> <K, V> <T>

import java.util.stream.Stream;

interface SUPERKEY<K, V>{ // key and value pair ordered vs unordered
    public K getKey();
    public V getValue();

}

public class GenericsUtils {

   static SUPERKEY<Integer, String> superkey4 = new SubSuper<>(1, "Tesla");
   static SUPERKEY<Integer, String> superkey5 = new SubSuper<>(2, "BMW");
   static SUPERKEY[] staticsuperkeys = {superkey4, superkey5};

    public static void main(String[] args) {
        // Car priorities: 1, 2, 3 names of the cars
        SUPERKEY<Integer, String> superkey1 = new SubSuper<>(1, "Tesla");
        SUPERKEY<Integer, String> superkey2 = new SubSuper<>(2, "BMW");
        SUPERKEY<Integer, String> superkey3 = new SubSuper<>(3, "Ford 150");

        toString(superkey1.getKey(), superkey1.getValue());
        toString(superkey2.getKey(), superkey2.getValue());
        toString(superkey3.getKey(), superkey3.getValue());

        SUPERKEY[] superkeys = new SUPERKEY[]{superkey1, superkey2, superkey3};

     //   System.out.println(staticsuperkeys.toString()); fix the bug

        Utilities.getPersonIterator(superkeys);
    }


    public static <K,V> void toString(K key, V value){
        System.out.println("\nKey: " + key + "\n" +
                            "Value: " + value + "\n");
    }

    public static <K, V> void getPersonIterator(SUPERKEY<K,V> person)
    {
        // generic for each that needs fix as well
        Stream<SUPERKEY<K, V>> stream = Stream.of(person);
        stream.forEach(System.out::println);

    }

//    public String toString(){
//        for (int i = 0; i < staticsuperkeys.length; i++) {
//            System.out.println(staticsuperkeys[i].getKey());
//        }
//        return "";
//    }
}

// Create a concrete class that implements the interface
class SubSuper<K, V> implements SUPERKEY<K, V>{

    private final K key;
    private final V value;

    public SubSuper(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
