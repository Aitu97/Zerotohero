package ConstructorPractice;

public class reversedString {

    public void reversedString(String str){
        String [] words=str.split(" ");
        String reversed="";
        for (int i=words.length-1; i>=0; i--){

            reversed+=words[i]+" ";
        }
        reversed.trim();
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        reversedString test=new reversedString();
        String name="Process finished with exit code 0";
        test.reversedString(name);
    }
}
