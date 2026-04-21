package classAndobjectPractive;

public class Student {
    private String name;
    private String gender;
    private int age;


    public String toString(){

        return "\nname: " + name + "\nGender: " + gender + "\nAge: " + age;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}
