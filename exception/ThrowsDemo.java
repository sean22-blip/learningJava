package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsDemo {

    public static void main(String[] args) throws FileNotFoundException {
        // try {
        //     readFile2();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        //     System.out.println(">> Your file is not found <<");
        // }
        // readFile();
        // System.out.println("=============================");
        // readFile2();
        readFile();
    }

    public static void readFile() {
        File file = new File("C:\\Users\\CADT\\OneDrive - Cambodia Academy of Digital Technology\\Desktop//ranewewdom.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("=== File is not found ===");
        }
    }

    public static void readFile2() throws FileNotFoundException {
        File file = new File("C:\\Users\\CADT\\OneDrive - Cambodia Academy of Digital Technology\\Desktop//randomfdfaf.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }

}
