package day2.ResourceEx;

import java.io.*;

public class FileTryWithResourceEx implements AutoCloseable{
    public static void main(String[] args) {
        try(FileWriter file =new FileWriter("data2.txt")){
            file.write("sooooooo dificult");
        }catch (IOException e){
            e.printStackTrace();
        }

        try(
                FileReader fis = new FileReader("data.txt");
                BufferedReader dis = new BufferedReader(fis)
                ){
            while (true){
                String data = dis.readLine();
                if(data != null){
                    System.out.println(data);
                }else break;
            }
        } catch (EOFException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
