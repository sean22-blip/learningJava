package practiceFileio.services;

import practiceFileio.helper.StudentHelper;
import practiceFileio.students.Student;

public class StudentApplication {
    public static void main(String[] args) {
        // Student student = new Student(1, "John Doe", Gender.MALE, 85.5);
        // Student student2 = new Student(2, "Jane Smith", Gender.FEMALE, 92.0);
        // StudentService studentService = new StudentService();
        // studentService.saveStudent(student);
        // studentService.saveStudent(student2);
        // FileHelper.readData();
        // List<String> data = FileHelper.readData();
        // StudentService studentService = new StudentService();
        // List<Student> students = studentService.getAllStudents();
        // for(Student s: students){
        //     System.out.println(s.toInfo());
        // }
        // System.out.println(data);
        // for(String s: data){
            // System.out.println(s);
        // }
        int numberOfStudents = 2;   
        for(int i = 0; i < numberOfStudents; i++){
            Student student = StudentHelper.createStudent();
            StudentService studentService = new StudentService();
            studentService.saveStudent(student);
        }
    }
}
