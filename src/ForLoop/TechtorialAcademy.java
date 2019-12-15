package ForLoop;

public class TechtorialAcademy {

    public static void main(String[] args) {

        String name="Techtorial Academy";
        //index will return the number
        //charAt will return the char
        //index number y is 17
        //what is the length 18
        System.out.println(name.charAt(18));
        //it will give the stringIndexOutOfBoundExeption
        //run time


        for (int i=0; i<=name.charAt('a'); i++ ){

            name.toLowerCase();
            name.toUpperCase();
            name.toLowerCase();
        }
        System.out.println(name);
    }
}
