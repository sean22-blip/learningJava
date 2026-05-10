package file.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamDemo {
    public static void main(String[] args) {
        byte[] myData = new byte[100];
        try {
            InputStream inputStream = new FileInputStream("/home/isean/Desktop/data.txt");
            System.out.println(inputStream.available());
            inputStream.read(myData);
//            System.out.println(Arrays.toString(myData));
//            for(byte b : myData){
//                System.out.print((char) b);
//            }
            String data = new String(myData);
            System.out.print(data);
//            System.out.println(inputStream.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
