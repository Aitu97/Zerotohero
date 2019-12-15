package SwitchStatement;

public class Practice {

    public static void main(String[] args) {

        char ch='h';
        final char hr='h';

        switch (ch){

            case 'a':
                System.out.println("The value is apple");
            break;

            case 'b':
                System.out.println("The value is Blueberry");
             break;

            case hr:
                System.out.println("The value is HR");
            break;

             // in case statement values should be constant (not changing)
            // in java if you want to make one value as a constant,
            // we are using "final" keyword

        }
    }
}
