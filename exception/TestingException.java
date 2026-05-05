package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestingException{
public static void main(String[] args) {
File file = new File("C:\\TempFolder\\person.txt");
try {
    Scanner scanner = new Scanner(file);
    while(scanner.hasNext()){
        System.out.println(scanner.next());
    }
    scanner.close();
} catch (FileNotFoundException e) {
    e.printStackTrace();
}finally{
    System.out.println("Successfully exiting the file checking!!!");
}
}
}
