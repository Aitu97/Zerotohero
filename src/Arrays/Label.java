package Arrays;

public class Label {

    public static void main(String[] args) {

        for (int i=0; i<10; i++){

            if (i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("---------------");

       Construction: for (int i=0; i<10; i++){
            System.out.println(i);
            for (int j=1; j<5; j++){
                System.out.println(j);
                if (j==2){
                    break Construction;
                }
            }
        }
    }
}
