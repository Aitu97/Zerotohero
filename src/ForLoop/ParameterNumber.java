package ForLoop;

public class ParameterNumber {

   public boolean palindrome (int original){
       int reversed = 0;
       int temp=original;
       while (temp>0) {

           int reminderOriginal = temp % 10;
           reversed = reversed * 10 + reminderOriginal;
           temp = temp / 10;
       }
       if (reversed==original){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {

       ParameterNumber parameterNumber=new ParameterNumber();

       boolean result =parameterNumber.palindrome(1221);
        System.out.println(result);
    }
}
