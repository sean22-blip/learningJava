package exception;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        // System.out.println("Handling Exception");
        Scanner sc = new Scanner(System.in);
        System.out.println("First line");
        int a = 0;
        int b = 5;
        String[] name = {"Dara", "Thida"};
        try {
            System.out.println("Before result");
            int result = b / a;
            System.out.println("Result :" + result);
        } catch (ArithmeticException e) {
            System.out.println("There is ArithmeticExceoption occured!!!!!");
            // System.out.println(e.getMessage());//show the error message
            e.printStackTrace(); //showing the error message in detail but safer because of catch
            // return;
            // System.exit(1); // 0 or 1 it does not matter it it wil kill the JVM immediately
            // Think of System.exit() as a power button 🔴
            // exit(0) = normal shutdown exit
            // (1) = emergency shutdown
        } finally {
            System.out.println(name[0]);
            System.out.println("=== End of result ===");
        }
        // System.out.println(result);
        System.out.println("Second line");

        //     while(true){
        //     try{        System.out.print("Enter your name: ");
        //     String name = sc.nextLine();
        //     if(!name.matches("[a-zA-Z ]+")){
        //         System.out.println("Please enter a valid format!!!!");
        //     }else{
        //         System.out.println("Successfully entered name!");
        //         break;
        //     }
        // }catch(Exception e){
        //     System.out.println("Entered the catch exception");  
        //     System.out.println("Second line");
        // }
    }
}
