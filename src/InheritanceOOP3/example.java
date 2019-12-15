package InheritanceOOP3;

public class example extends staticBlock {

    static {
        System.out.println("im static block of example class");
    }
    {
        System.out.println("im instance block of example class");
    }
    public example(){
        System.out.println("im constructor of example class");
    }
}
