package collection_Framework.enumDemo;
import java.util.EnumSet;
import java.util.Set;
public enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE, XXL;
     public static Set<Size> getAllSizes(){
        //  Set<Size> sizes = new HashSet<>();
        //  sizes.add(Size.SMALL);
        //  sizes.add(Size.MEDIUM);
        //  sizes.add(Size.LARGE);
        //  sizes.add(Size.EXTRALARGE);
        //  return sizes;
        return EnumSet.allOf(Size.class);//get all the element of the Size without having to use .add();

     };



}
