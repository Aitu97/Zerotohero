package WhileLoop;

public class charat {

    public static void main(String[] args) {

        String name="Tech1to2ri3a4l";

        for (int i=0; i<=name.length()-1; i++){
            for (char ch='1'; ch<='9'; ch++){
                if (name.charAt(i)==ch){
                    System.out.print(name.charAt(i));
                }

            }
        }
    }
}
