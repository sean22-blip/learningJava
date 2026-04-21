package anonymousInnerClass;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Dara", 18),
                new Student("Sey", 19),
                new Student("David", 20),
                new Student("Sana",80),
        };
//        System.out.println("Before sort:");
//        for(Student student : students) {
//            System.out.println(student);
//        }
//        System.out.println("After sort");
//        Arrays.sort(students, new SortByAge());
//        for(Student student : students) {
//            System.out.println(student);
//        }
//        Comparator<Student> sortByName = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        };
//
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.getAge() - (o2.getAge());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
