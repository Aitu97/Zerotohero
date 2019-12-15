package Exceptions;

public class MultiCatchExceptions {

    public static void main(String[] args) {

        String id="2a345e";
        int idNum=0;

        try {
            idNum=Integer.parseInt(id);
            System.out.println(idNum);
            id="111";
            idNum=Integer.parseInt(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }finally {
            System.out.println("im in finally block");
        }

        System.out.println("im out of try catch block");
        System.out.println(idNum);



    }
}
