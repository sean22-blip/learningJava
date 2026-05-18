package practiceFileIO.services;

import practiceFileIO.students.Student;
import practiceFileIO.helper.FileHelper;

public class StudentService {
public void saveStudent(Student student){
    FileHelper.saveToFile(student.toData());
}
}
