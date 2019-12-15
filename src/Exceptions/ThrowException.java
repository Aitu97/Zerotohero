package Exceptions;

import java.io.IOException;

public class ThrowException {

    public static void main(String[] args) {

        try{
            System.err.println("im about to throw an Exception");
            throw new IOException();
           // System.out.println("im in try block");
        }catch (IOException e){
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("im finally here");
        }
    }
}
