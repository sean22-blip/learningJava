package collection_Framework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        // apple = 25
        // banana = 15
        // mango = 10.5

        Map<String, Double> fruitMap = new HashMap<>();//(16, 0.7f) this has 16 capacity but size 3
        fruitMap.put("apple", 20.4);
        fruitMap.put("banana", 15.0);
        fruitMap.put("mango", 10.5);
        // System.out.println(fruitMap.get());
//    Double price1 = fruitMap.get("banana");
//    Double price1 = fruitMap.getOrDefault("orange", 0.0);

//    fruitMap.putIfAbsent("banana", 20.0); // this is better
//    fruitMap.replace("banana", 15.0, 90.2); // if the oldValue matches the .put then it replaces with the new value
//    fruitMap.put("banana", 20.1);
//    fruitMap.remove("banana", 15.0);//if matches the price then delete
//if(fruitMap.containsKey("apple")){
//    System.out.println("it does");
//}else{
//    System.out.println("does not");
//}
//    boolean exist = fruitMap.containsKey("banana"); // containsKey is boolean by default
//    System.out.println(exist);
//    System.out.println(fruitMap.keySet()); // only shows the key nothing else
//    System.out.println(fruitMap.values()); // only shows the value nothing else
//    System.out.println(fruitMap);
//    System.out.println(fruitMap.entrySet());
//    Set<String> keys = fruitMap.keySet();
//        for (String key : fruitMap.keySet()) {
//            System.out.println(key);
//        }
//        for (Double value : fruitMap.values()) {
//            System.out.println(value);
//        }
        // for(Map.Entry<String, Double> entry: fruitMap.entrySet()){
        //     System.out.println(entry.getKey() + ", price: " + entry.getValue());
        // }
        System.out.println(fruitMap);
        HashMap<String, Double> map2 = new HashMap<>(fruitMap);//by default is is (16, 0.75f) // what does 0.75f mean ? this mean if the map2 is 75% it will resize doubleing the orignial size from 16 to 32
        // Duplicate keys — value gets OVERWRITTEN
        map2.put("test", 30.6);
        map2.put("test", 31.0);   // overwrites 30.6
        map2.put("test", 32.5);   // overwrites 31.0

// New unique keys — all get added
        map2.put("grape", 5.0);
        map2.put("grape", 7.5);   // overwrites 5.0
        map2.put("grape", 9.9);   // overwrites 7.5

        map2.put("orange", 3.0);
        map2.put("orange", 4.5);  // overwrites 3.0

        map2.put("cherry", 12.0);
        map2.put("cherry", 14.0); // overwrites 12.0

        map2.put("peach", 8.0);
        map2.put("peach", 9.0);   // overwrites 8.0

        map2.put("plum", 6.5);
        map2.put("pear", 11.0);
        map2.put("lemon", 2.5);
        map2.put("lime", 3.3);
        map2.put("melon", 7.0);
        map2.put("kiwi", 4.0);
        map2.put("fig", 15.0);
        map2.put("papaya", 6.0);
        map2.put("guava", 5.5);
        map2.put("lychee", 13.0);
        map2.put("coconut", 20.0);
        map2.put("jackfruit", 18.0);
        map2.put("durian", 25.0);
        map2.put("rambutan", 9.0);
        map2.put("starfruit", 7.5);
        map2.put("dragonfruit", 16.0);
        map2.put("passionfruit", 11.5);
        map2.put("persimmon", 8.5);
        map2.put("mulberry", 10.0);
        map2.put("elderberry", 14.5);
        map2.put("blackberry", 6.0);
        map2.put("blueberry", 5.5);
        map2.put("raspberry", 7.0);
        map2.put("strawberry", 4.5);
        map2.put("watermelon", 9.5);
        map2.put("pineapple", 12.5);
        map2.put("pomegranate", 17.0);
        map2.put("apricot", 8.0);
        map2.put("nectarine", 9.5);
        map2.put("tangerine", 3.5);
        map2.put("mandarin", 4.0);
        map2.put("clementine", 3.8);
        map2.put("avocado", 5.0);

        // System.out.println("Size: " + map2.size());
        System.out.println(map2);
        //after putting it in this has 16 capacity but size 4
        // map2.put("map2#1", 21.21);
    }
}
