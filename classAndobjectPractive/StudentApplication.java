package classAndobjectPractive;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
//
        System.out.print("Enter number of student: ");
        int numberOfStudent = scanner.nextInt();
        Student[] studentArr = studentService.createStudentArr(numberOfStudent);
//        System.out.println("\n============== Before sorting by Name ============== ");
//        studentService.print(studentArr);
//
//        studentService.sortByName(studentArr);
//        System.out.println("\n============== After sorting by Name ============== ");
//        studentService.print(studentArr);

//        System.out.println("\n============== Sort by Age ============== ");
//        studentService.sortByAge(studentArr);
//        studentService.print(studentArr);
        Student oldestStudent = studentService.geteOldestStudent(studentArr);
        System.out.println("\n============== Oldest Student ============== ");
        System.out.println(oldestStudent);
    }

}
