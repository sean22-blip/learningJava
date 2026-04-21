package collection_Framework.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

public static void main(String[] args) {
    // apple = 25
    // banana = 15
    // mango = 10.5
    
    Map<String, Double> fruitMap = new HashMap<>();
    fruitMap.put("apple", 20.4);
    fruitMap.put("banana", 15.0);
    fruitMap.put("mango", 10.5);
    // System.out.println(fruitMap.get());
//    Double price1 = fruitMap.get("banana");
//    Double price1 = fruitMap.getOrDefault("orange", 0.0);

//    fruitMap.putIfAbsent("banana", 20.0); // this is better
    fruitMap.replace("banana", 90.2);
//    fruitMap.put("banana", 20.1);

    System.out.println(fruitMap);
}

}
