package InterfaceOOP2;

public  class Samsung extends cellPhone {
    @Override
    public void call() {
        System.out.println("samsung is calling");
    }

    @Override
    public void text() {
        System.out.println("samsung is texting");

    }

    @Override
    public void takePicture() {
        System.out.println("samsung is taking picture");
    }

    @Override
    public void location() {
        System.out.println("samsung  has flach card on side");
    }

    @Override
    public void faceID() {
        System.out.println("amsung has faceID function");

    }
}
