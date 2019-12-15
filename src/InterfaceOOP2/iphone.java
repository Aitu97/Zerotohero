package InterfaceOOP2;

public class iphone extends cellPhone {
    @Override
    public void call() {
        System.out.println("iphone is calling ");
    }

    @Override
    public void text() {
        System.out.println("iphone is texting");

    }

    @Override
    public void takePicture() {
        System.out.println("iphone is taking a pic");

    }

    @Override
    public void location() {
        System.out.println("iphone doesn't have flash card");

    }

    @Override
    public void faceID() {
        System.out.println("iphone has faceID function");

    }
}
