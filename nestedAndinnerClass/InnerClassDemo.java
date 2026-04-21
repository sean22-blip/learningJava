package nestedAndinnerClass;

public class MAin {
    public static void main(String[] args) {

        Computer com1 = new Computer("Dell");

        Computer.CPU cpu1 = com1.new CPU(12, "Intel");
//        com1.display();
        cpu1.info();
    }
}
