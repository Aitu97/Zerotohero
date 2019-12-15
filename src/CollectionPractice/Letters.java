package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class Letters {

   /* TASK:
    Create one method will take the string as a value and
    this method will return letters of the string with count

    */

    public static void main(String[] args) {



        HashMap<String, Integer> countOfletter=new HashMap<>();

        countOfletter.containsKey("A");
        countOfletter.put("a", 1);
        countOfletter.containsKey("I");
        countOfletter.put("i", 1);
        countOfletter.containsKey("T");
        countOfletter.put("t", 1);
        countOfletter.containsKey("U");
        countOfletter.put("u", 1);
        System.out.println(countOfletter);

    }

    public void getLetter(String str){
        Map<String , Integer> letters=new HashMap<>();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (letters.containsKey(ch)){
                int count=letters.get(ch);
             //   letters.replace( ++count);
            }else {

            }


        }
    }





}
