package ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        // palindrome:
        //civic,

        String name="civic";
        String  reverse="";

        //for loop
        //after for loop print the reverse="utiA"

        for ( int i= name.length()-1; i>=0; i-- ){

            reverse= reverse+ name.charAt(i);

        }System.out.println(reverse);
        if (reverse.equalsIgnoreCase(name)){
            System.out.println(reverse+ " is palindrome");
        }else {
            System.out.println(reverse+ " is not palindrome");
        }
    }
}
