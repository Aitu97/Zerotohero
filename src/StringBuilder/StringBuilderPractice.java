package StringBuilder;


import java.util.Scanner;

public class StringBuilderPractice {

    public static void main(String[] args) {

      Scanner scanner=new Scanner(System.in);

        StringBuilder table=new StringBuilder();

        StringBuilder table1= new StringBuilder("Rockwell ");

        System.out.println(table);

        table.append("ikea ");

        // Dynamic Polymorphism --> Java doesn't know which method to call until run time
        //at run time java will select method according to your parameter.

        System.out.println(table);

        table.append(10);

        System.out.println(table);

      /*  String name="ikea";

        name.concat("10");

        System.out.println(name);

       */

      table1.append(10.4);

        System.out.println(table1);

        StringBuilder success=new StringBuilder().append("Techtorial").append(2019);

        success.append("Best Year Ever").append(true);

        System.out.println(success);

        //new StringBuilder().append("Tech");// "anonymous object" which will go to garbage collection.

        System.out.println("Tech".charAt(0));

        System.out.println("----------------------------------------------------------------------------------------");


        StringBuilder computer=new StringBuilder();

        for (char i='a';i<='z'; i++){

            computer.append(i);
        }

        System.out.println(computer);

        System.out.println("----------------------------------------------------------------------------------------");


        StringBuilder success1=new StringBuilder("Working hard");success1.append("Does not make you successful");

        System.out.println(success1);// Working hard does not make you successful

        StringBuilder truth=success1.append("Thinking hard makes you successful");

        //working hard does not make you successful. thinking hard makes you successful.

        System.out.println(success1);//working hard does not make you successful. thinking hard makes you successful.

        System.out.println(truth);//working hard does not make you successful. thinking hard makes you successful.

        System.out.println("----------------------------------------------------------------------------------------");


        StringBuilder success2=new StringBuilder("Tech");

        success2.append("torial");

        StringBuilder truth1=success2.append("2019");

        truth1=truth1.append("Best").append("Summer");

        System.out.println(success2);

        System.out.println(truth1);

        success2.append(10);

        System.out.println(success2);

        System.out.println(truth1);

        System.out.println("----------------------------------------------------------------------------------------");



        StringBuilder tree=new StringBuilder("Oak");

        StringBuilder tree1=new StringBuilder("Oak").append("14");

        System.out.println(tree);

        System.out.println(tree1);

        char nm=tree.charAt(1);// need to specify it.

        System.out.println(nm);


        System.out.println(tree);

        //If you call the method and return type is StringBuilder, in this case your original StringBuilder value will change.
        //.append (); --> Return type is StringBuilder

        int index=tree.indexOf("ak");

        System.out.println(index);

        int length=tree.length();

        System.out.println(length);

        String subs=tree.substring(1);

        System.out.println(subs);

        System.out.println(tree);

        String tr = tree1.append("10").append(true).substring(5);

        tree1.append('k');

        System.out.println(tree1);

        System.out.println("----------------------------------------------------------------------------------------");



        StringBuilder apple=new StringBuilder("Aple");

        apple.insert(1,"p");

        System.out.println(apple);

        apple.insert(5,"s number is 10");

        System.out.println(apple);

        //Loop .insert(2, "-");
        StringBuilder [] builders={tree, tree1, computer, apple};
        //TASK store the hyphen after 2 index in StringBuilder object.


        for (StringBuilder builder: builders){

            builder.insert(2, "-");

            System.out.println(builder);
        }

        StringBuilder mouse=new StringBuilder("Microsoft");

        mouse.delete(0, 3);

        System.out.println(mouse); // rosoft

        mouse.deleteCharAt(2);

        System.out.println(mouse); // rooft

        mouse.reverse();

        System.out.println(mouse);  //tfoor

        String mouse1=mouse.toString();

        String mouse2=mouse.substring(0);

        String mouse3=""+mouse;

        System.out.println(mouse3);

        StringBuilder camera=new StringBuilder("Camera");

        StringBuilder camera1=new StringBuilder("Camera");

        System.out.println(camera.equals(camera1));











    }
}
