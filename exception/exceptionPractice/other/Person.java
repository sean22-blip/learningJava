package exception.exceptionPractice.other;

import java.time.LocalDate;

public class Person {

    private String name, gender, idCard;
    private int id;
    private LocalDate dateOfBirth;

    public Person(LocalDate dateOfBirth, String gender, int id, String idCard, String name) {
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.idCard = idCard;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + ", idCard=" + idCard + ", id=" + id + ", dateOfBirth="
                + dateOfBirth + "]";
    }

}
