package InterfaceOOP;

public interface Store {

    // all variables of interface by default are:
    // public static final
    // public static final int capacity
    int CAPACITY=20;

    // public abstract  void sellItem();
    void sellItem();

    int countEmployees();

    default void displayItem(){
        System.out.println("Macy's is displaying shoes");
    }
}
