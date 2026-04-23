package collection_Framework.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, Double> fruitMap = new TreeMap<>();
        fruitMap.put("orange", 14.6);
        fruitMap.put("mango", 10.5);
        fruitMap.put("banana", 15.0);
        fruitMap.put("apple", 20.4);
        fruitMap.put("test", 210.4);
        System.out.println(fruitMap);
        // System.out.println(fruitMap.firstKey());
        // System.out.println(fruitMap.lastKey());
        // System.out.println(fruitMap.firstEntry());
        // System.out.println(fruitMap.lastEntry());
        // System.out.println(fruitMap.higherKey("appl"));
        // System.out.println(fruitMap.higherKey("apq"));
        // System.out.println(fruitMap.higherKey("applo"));
        // System.out.println(fruitMap.higherKey("banana"));//the key that is above it like apple bigger than apple is banana a,b,c...
        // System.out.println(fruitMap.lowerKey("apple")); //return null
        // System.out.println(fruitMap.lowerKey("3223"));also return null
        // System.out.println(fruitMap.lowerKey("banana"));
        // System.out.println(fruitMap.lowerKey("mango"));
        // System.out.println(fruitMap.ceilingKey("banana"));
        // System.out.println(fruitMap.ceilingKey("apple"));
        // System.out.println(fruitMap.ceilingKey("orange"));
        // System.out.println(fruitMap.ceilingKey("mango"));
        // System.out.println(fruitMap.floorKey("ora"));
        // System.out.println(fruitMap.floorKey("orange"));

        // System.out.println(fruitMap.higherKey("orange"));
        // System.out.println(fruitMap.higherKey("orange"));
        // System.out.println(fruitMap.higherKey("ora"));
        // System.out.println(fruitMap.higherKey("mango"));
        // System.out.println("");
//         System.out.println(fruitMap);
//         System.out.println(fruitMap.get("mango"));
// for(Map.Entry<String, Double> entry: fruitMap.entrySet()){
//             System.out.println(entry.getKey() + " ==> " + entry.getValue());
//         }
//         System.out.println(fruitMap.pollFirstEntry());//remove the first entry that is why apple is gone
//         System.out.println(fruitMap.pollLastEntry());//remove the last entry that is why orange is gone
//         System.out.println(fruitMap);
// SortedMap<String, Double> headMap = fruitMap.headMap("apple");// nothing {}
        SortedMap<String, Double> headMap = fruitMap.headMap("orange", true);
        // System.out.println(headMap);
        // SortedMap<String, Double> tailMap = fruitMap.tailMap("orange");
        // SortedMap<String, Double> tailMap = fruitMap.tailMap("apple", true); // does not need true
        // SortedMap<String, Double> tailMap = fruitMap.tailMap("apple"); // does not need true
        // SortedMap<String, Double> tailMap = fruitMap.tailMap("orange", true);
        SortedMap<String, Double> tailMap = fruitMap.tailMap("banana", false);
        // only from banana downward b,c,d,e 2,3,4
        //false mean removing the banana
        // System.out.println(tailMap);

        System.out.println(fruitMap.subMap("apple", true, "orange", true));
        System.out.println(fruitMap.subMap("apple", false, "orange", true));
        // subMap uses to get key+value from the start to end










        TreeMap<Integer, String> fruitMap1 = new TreeMap<>();
        fruitMap1.put(4, "Fourth");
        fruitMap1.put(3, "Third");
        fruitMap1.put(2, "Second");
        fruitMap1.put(1, "First");
        // System.out.println(fruitMap1);
        // System.out.println(fruitMap1.firstKey());
        // System.out.println(fruitMap1.firstEntry());//both keys and value for Entry

        TreeMap<String, Double> fruitMap3 = new TreeMap<>();
        fruitMap3.put("mango", 10.5);
        fruitMap3.put("banana", 15.0);
        fruitMap3.put("orange", 14.6);
        fruitMap3.put("apple", 20.4);
    }
}
