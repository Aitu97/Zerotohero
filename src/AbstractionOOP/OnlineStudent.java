package AbstractionOOP;

public class OnlineStudent extends Student {


    @Override
    public void study() {
        System.out.println("online student is studying harder than campus student");

    }

    @Override
    void attendClass() {
        System.out.println("online student attend the class");

    }
}
