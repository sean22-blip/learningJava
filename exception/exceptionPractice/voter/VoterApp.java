package exception.exceptionPractice.voter;

import exception.exceptionPractice.other.Person;
import java.time.LocalDate;

public class VoterApp {

    public static void main(String[] args) {
        Person person = new Person(LocalDate.of(2010, 12, 9), "Male", 676767, "number1", "Isean");
        VoterServices voterServices = new VoterServices();
        try {
            voterServices.register(person);
            voterServices.displayVoters();
            System.out.println("Complete!!!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
