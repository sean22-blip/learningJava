package practiceFileio.helper;

import java.util.Scanner;
import practiceFileio.students.Gender;
import practiceFileio.students.Student;
public class StudentHelper {

    static int count = 0;

    public static Student createStudent(){
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter student name: ");
String name = scanner.nextLine();
System.out.print("Enter student gender (MALE  or FEMALE): ");
String genderInput = scanner.nextLine();
System.out.print("Enter student grade: ");
double grade = scanner.nextDouble();
scanner.nextLine(); 
// count++;
int id = ++count;
Student student = new Student(id, name, Gender.valueOf(genderInput), grade);
return student;
    }

}
