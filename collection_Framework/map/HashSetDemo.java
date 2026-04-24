package collection_Framework.map;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // // Set<String> names = new HashSet<>();
        // HashSet<String> names = new HashSet<>();
        // names.add("Dara");
        // names.add("Thida");
        // names.add("Cheata");
        // // names.add("Cheata");//no duplication
        
        
        // // System.out.println(names);

        // List<String> list1 = new ArrayList<>();
        // list1.add("Seyha");
        // list1.add("Lida");

        // // list1.addAll(names);
        // // names.addAll(list1);
        // // System.out.println(list1);
        // // names.remove("Lida");
        // // names.removeAll(names);
        // System.out.println(names);


        // Iterator<String> iterator = names.iterator();

        // // for(String name : names){
        // //     System.out.println(name);
        // // }

        // // while(iterator.hasNext()){
        // //    String name = iterator.next();
        // //    System.out.println(name);
        // // }


        Set<Integer> set1 = new HashSet<>();
        set1.add(23);
        set1.add(33);
        set1.add(43);
        set1.add(40);
        Set<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(33);
        set2.add(43);
        
        // set1.addAll(set2);
        // set1.retainAll(set2);
        // set1.removeAll(set2); // removing all "Integer" that has the same numbers and it is left with the one that is not the same
        // System.out.println(set1);

        boolean containsAll = set1.containsAll(set2);
        System.out.println(containsAll);//subset which mean set2 is a subset of set1 if and only if all the elemnet insdie set2 is apart of set1
// set1 is not a subsets of set2 because set2 does not contains all the value inside set1 
// but if we were to say set2 is a subset of set1 is correct 
// because set2 does contain all of the value needed to be a subset of set1 right
         

    }
}
