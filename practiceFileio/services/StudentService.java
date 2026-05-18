package practiceFileio.services;

import practiceFileio.helper.FileHelper;
import practiceFileio.students.Student;

public class StudentService {
public void saveStudent(Student student){
    FileHelper.saveToFile(student.toData());
}
}
