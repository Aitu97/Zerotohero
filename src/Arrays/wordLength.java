package Arrays;

public class wordLength {

    public static void main(String[] args) {

        String[] names={"Eric", "John", "Patel", "Harsh", "Sarah", "Lily", "Nina"};
        // print out names which has 4 length
        for (int i=0; i<names.length; i++){
            if (names[i].length()== 4) {
                System.out.println(names[i]);

            }
        }



    }
}
