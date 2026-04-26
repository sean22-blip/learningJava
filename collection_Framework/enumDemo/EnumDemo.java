package collection_Framework.enumDemo;

import java.util.EnumSet;

public class EnumDemo {

    public static void main(String[] args) {
        // Set<Size> sizes = new HashSet<>();
        //   sizes.add(Size.SMALL);
        //  sizes.add(Size.MEDIUM);
        //  sizes.add(Size.LARGE);
        //  sizes.add(Size.EXTRALARGE);
        //  System.out.println(Size.getAllSizes());

        EnumSet<Size> sizes2 = EnumSet.allOf(Size.class);//get all the element of the Size without having to use .add();
        // System.out.println(sizes2);

        EnumSet<Size> set3 = EnumSet.noneOf(Size.class);
        set3.add(Size.LARGE);
        // System.out.println(set3);//can not add anything beside the type of element inside Enum

        EnumSet<Size> set4 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        // EnumSet<Size> set4 = EnumSet.range(Size.SMALL, Size.SMALL);
        // System.out.println(set4);
        EnumSet<Size> set5 = EnumSet.of(Size.MEDIUM, Size.EXTRALARGE); // only get the element of what is inside the .of()
        // System.out.println(set5);
        
    }

}
