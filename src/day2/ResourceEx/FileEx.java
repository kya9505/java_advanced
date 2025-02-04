package day2.ResourceEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args){
        FileWriter file1 = null;

        try {
            file1 = new FileWriter("data1.txt");
            file1.write("java Advenced programming");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                file1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
