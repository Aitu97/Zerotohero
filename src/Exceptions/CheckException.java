package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckException {

    public static void main(String[] args) {

        String filePath="src/Exceptions/myFile.txt";

        // FileReader -> throwing FileNotFoundException
        // readLIne() -> throwing IOException
        // Throwable -> Exception -> IOException -> FileNotFoundException

        try {
    FileReader reader=new FileReader(filePath);
            BufferedReader reader1=new BufferedReader(reader);
            String line=reader1.readLine();
            String line2=reader1.readLine();
            System.out.println(line);
            System.out.println(line2);
            String line3=reader1.readLine();
            System.out.println(line3);
         //  int line4=reader1.read();
           // System.out.println(line4);

    }catch (FileNotFoundException e){

    System.out.println(e.getMessage());
    System.out.println("there is an Exception");

    }catch (IOException e){

            System.out.println("this is IOException");

        }finally {
            System.out.println("i am finally block");
        }

    }
}
