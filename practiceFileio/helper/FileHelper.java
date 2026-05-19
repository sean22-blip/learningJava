package practiceFileio.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    private static String fileName = "/home/isean/Desktop/Student/students.txt";
public static void saveToFile( String data) {
    FileWriter fileWriter = null;
        try {
            File file = new File(fileName);
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}
public static List<String> readData(){
    File file = new File(fileName);
    List<String> listOfdata = new ArrayList<>();
    try {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // bufferedReader.readLine();
        String line = null;

        do{
            line = bufferedReader.readLine();
            if(line!= null){
            // System.out.println(line);
        listOfdata.add(line);
            }

        }while(line!= null);
        bufferedReader.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return listOfdata;    
}
}
