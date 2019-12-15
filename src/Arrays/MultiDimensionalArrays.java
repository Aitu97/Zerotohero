package Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        String[] [] multiD={{"aa","ab"},{"bb", "ba"}, {"ca","cc","cd"}};
        // String[] []

        System.out.println(multiD[0][0]);
        System.out.println(multiD[0][1]);
        System.out.println(multiD[1][0]);
        System.out.println(multiD[1][1]);
        System.out.println(multiD[2][0]);
        System.out.println(multiD[2][1]);
        System.out.println(multiD[2][2]);

        System.out.println("----------------");

        for (String[] innerArray: multiD){
            for (String letter: innerArray){
                System.out.println(letter);
            }
        }
    }
}
