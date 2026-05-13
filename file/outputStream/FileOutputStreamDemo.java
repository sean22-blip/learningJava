package file.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
public static void main(String[] args) {


try{
    // String text =  "Piseth Java School 2023";
    String text = "Write text file from output stream";
    OutputStream output = new FileOutputStream("/home/isean/Desktop/data1.txt", true);
    output.write(text.getBytes(), 11, 9);
    // output.write();
    // output.write("I am from Cambodia".getBytes());
    output.close();
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }catch (IOException e){
        e.printStackTrace();
    }

}}
