package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowDemo
{
    // public static void main(String[] args) throws FileNotFoundException{
    public static void main(String[] args) throws IOException, RuntimeException{//any exception works
        int age = 17;
        if (age < 18) {
            // throw new Exception("Age under 18 cannot vote!!!");
            throw new FileNotFoundException("Age under 18 cannot vote!!!");
        }

        if(age > 50){
            throw new RuntimeException("You are too old to vote!!");
        }
        System.out.println("can vote!!");
    }
}