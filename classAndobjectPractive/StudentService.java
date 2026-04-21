package classAndobjectPractive;

import java.util.Scanner;

public class StudentService {
    public Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        Student st = new Student();
        System.out.print("Enter name: ");
        String name = scanner.next();
        st.setName(name);
        System.out.print("Enter gender: ");
        st.setGender(scanner.next());
        System.out.print("Enter age: ");
        st.setAge(scanner.nextInt());
        return st;
    }

    public Student[] createStudentArr(int n) {
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            System.out.println("Student: " + (i+1));
            students[i] = createStudent();
        }
        return students;
    }
    public void print(Student[] students){
        for(Student st: students){
            System.out.println(st);
        }
    }
    public void sortByName(Student[] students){
        for(int i = 0; i < students.length; i++){
            for(int j = i+1 ; j < students.length; j++){
                if(students[i].getName().compareTo(students[j].getName()) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public void sortByAge(Student[] students){
        for(int i = 0; i < students.length; i++){
            for(int j = i+1 ; j < students.length; j++){
                if(students[i].getAge() > (students[j].getAge())) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public Student geteOldestStudent(Student[] students) {
        Student maxAgeStudent = students[0];
        for (int i = 0; i < students.length; i++) {
            if(maxAgeStudent.getAge() < students[i].getAge()){
                maxAgeStudent = students[i];
            }
        }
        return maxAgeStudent;
    }
}
