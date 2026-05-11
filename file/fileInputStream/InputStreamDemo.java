package file.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        byte[] myData = new byte[100];
        try {
            InputStream inputStream = new FileInputStream("/home/isean/Desktop/data.txt");


        //    int letter = inputStream.read();
        //    System.out.println((char)letter);
            // inputStream.read();
            inputStream.skip(14);
            inputStream.read(myData);

            System.out.println(inputStream.available());
            // inputStream.read(myData);
                    //    System.out.println(Arrays.toString(myData));
        //    for(byte b : myData){
        //        System.out.print(b);
        //    }
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
