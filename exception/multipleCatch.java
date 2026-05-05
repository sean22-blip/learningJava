package exception;

import java.util.Scanner;

public class multipleCatch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] names = {"Thida", "Dara", "Sey"};
    try {
        // int num = 10/0;
        String temp = names[4];
        System.out.println("Enter age:");
        int age = sc.nextInt();
    }catch(RuntimeException e){
        e.printStackTrace();
    }
    //  }catch(RuntimeException | ArithmeticException e){
    //     e.printStackTrace();
    //  }
    //  meaning if the parents is there then there is no need for child to be declared
    // catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
    //     e.printStackTrace();
    // } 
    // catch (Exception e) {
    //     e.printStackTrace();
    // }
    //implcit = auto  
    //explicit = manual   
}
}
