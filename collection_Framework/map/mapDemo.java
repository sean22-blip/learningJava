package collection_Framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        for(Map.Entry<String, Double> entry: fruitMap.entrySet()){
            System.out.println(entry.getKey() + ", price: " + entry.getValue());
        }
    }
}

