package crashingGracefully;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class NameException extends RuntimeException{
    NameException(String message){
    super(message);
    }
}

public class ExceptionPractice {
    public static void main(String[] args) throws NameException {
        Scanner scanner = new Scanner(System.in);
       
        try{
        System.out.println("Enter the product name: ");
        String text = scanner.nextLine();
        }catch (InputMismatchException e){
            throw new NameException("Can't be numbers!");
        }
        finally{
            System.out.println("Successfully finish the program!");
        }
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       