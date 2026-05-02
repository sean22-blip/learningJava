import java.io.File;
import java.io.FileNotFoundException;
import java.lang.classfile.FieldElement;
import java.util.Scanner;
public class TestingException{
public static void main(String[] args) {
//     File file = new File("Downloads/person");
//     //the problem is that when a file is not found when we are trying to try-catch
//     try{
//         Scanner scanner = new Scanner(file);//checking exception at compile time 
// }catch(FileNotFoundException e){
//     e.printStackTrace();
// }
// checkAge(-1);
checkAge(20);
// }

}
static public void checkAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative!"); // stops here 💥
    }
    System.out.println("Age is: " + age); // ← this NEVER runs
}
}
