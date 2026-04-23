package random;

public class Student {
    String name, id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: '" + name +
                ", Id:'" + id  +
                ", age: " + age ;
    }
}
