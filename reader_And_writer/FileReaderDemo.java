package reader_And_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) {
        char[] data = new char[100];
        try {
        Reader reader = new FileReader("/home/isean/Desktop/data.txt");
        reader.read(data);
        // System.out.println(reader.read(data));
        System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
