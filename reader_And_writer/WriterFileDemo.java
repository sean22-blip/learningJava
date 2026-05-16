package reader_And_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterFileDemo {
public static void main(String[] args) {
    try {
        String text = "\nPiseth java school";
        Writer writer = new FileWriter("/home/isean/Desktop/data1.txt", true);
        writer.write(text);
        //won't show anyting in the file unless we closes the program
        // System.out.println(writer.write(text));
        // writer.flush(); // flush will print the result the same as .close()
        writer.close(); // 
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
