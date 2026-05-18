package  practiceFileIO.students;
public class Student {
private int id;
private String name;
private Gender gender;
private double grade;

public Student(int id, String name, Gender gender, double grade) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.grade = grade;
}

public String toData(){
    String data = id + "," + name + "," + gender + "," + grade;
    return data;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Gender getGender() {
    return gender;
}

public void setGender(Gender gender) {
    this.gender = gender;
}

public double getGrade() {
    return grade;
}

public void setGrade(double grade) {
    this.grade = grade;
}

}
