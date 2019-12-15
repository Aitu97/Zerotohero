package InterfaceOOP2;

public abstract class Phone extends Object implements flashCard, faceRecognition1 {

    public Phone(){
        System.out.println("im phone class");
    }
    String name;
    String model;
    int size;

    public abstract void call();
    public abstract void text();
    public abstract void takePicture();



}
