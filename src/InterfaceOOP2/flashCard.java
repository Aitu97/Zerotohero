package InterfaceOOP2;

import java.awt.image.VolatileImage;

public interface flashCard extends faceRecognition1 {

    //public static final int SIZE=128;
    int SIZE=128;

    //public abstract void location;
    void location();

   default void regularMethod(){
        System.out.println("regular method from flashCard interface");
    }
    static void  staticMethod(){
        System.out.println("static method from flashCard interface");
    }
}
