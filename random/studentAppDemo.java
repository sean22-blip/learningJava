package random;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

public class studentAppDemo {
     public static void main(String[] args) {
        Map<String, Student> insertStudent = new HashMap<>();
        Student student = new Student("Mey", "1001", 20);
        Student student1 = new Student("Ash", "a2321", 24);
        Student student2 = new Student("Chloe", "32332", 90);
    insertStudent.put("s1", student);
    insertStudent.put("s2", student1);
    insertStudent.put("s3", student2);
        System.out.println(insertStudent);
    }
}
