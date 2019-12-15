package Exceptions;

public class CheckedException {
    public static void main(String[] args) throws Exception {

        System.out.println("im going to sleep.. ");
        Thread.sleep(5000);
        System.out.println("i woke up");

        try {
            System.out.println(5/0);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
            System.out.println("i finished my code");

    }
}
