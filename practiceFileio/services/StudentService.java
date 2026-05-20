package practiceFileio.services;

import java.util.ArrayList;
import java.util.List;
import practiceFileio.helper.FileHelper;
import practiceFileio.students.Gender;
import practiceFileio.students.Student;

public class StudentService {
    //to do seperate method for students

    public void saveStudent(Student student) {
        FileHelper.saveToFile(student.toData());
        System.out.println("Successfully saved!");
    }

    public List<Student> getAllStudents() { 
        // FileHelper.readData();
        List<String> dataList = FileHelper.readData();
        List<Student> students = new ArrayList<>();
        for (String text : dataList) {
            String[] data = text.split(",");

            int id = Integer.parseInt(data[0 ]);
            String name = data[1];
            Gender gender = Gender.valueOf(data[2]);
            double grade = Double.parseDouble(data[3]);
            Student student = new Student(id, name, gender, grade);
            students.add(student);
        }
        return students;
    }
}
