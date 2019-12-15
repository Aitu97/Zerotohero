package AbstractionOOP2;

import javax.swing.plaf.SeparatorUI;

public class TestShape {

    public static void main(String[] args) {

       Triangle triangle=new Triangle("triangle");
       triangle.height=5;
       triangle.width=6;
        System.out.println(triangle.calculateArea());
        triangle.draw();

        System.out.println("-------------");

        Circle circle=new Circle("circle");
        circle.radius=10;
        circle.calculateArea();
        System.out.println(circle.calculateArea());

        System.out.println("-------------");


    }
}
