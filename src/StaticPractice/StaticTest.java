package StaticPractice;

import ConstructorPractice.ComputerClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static StaticPractice.StaticReview.test;

import static StaticPractice.StaticReview.*;

import static StaticPractice.StaticReview.substract;

import static StaticPractice.StaticReview.divide;

import static StaticPractice.StaticReview.add;

import static StaticPractice.StaticReview.muliply;

import static  java.lang.Math.addExact;

import static java.lang.Math.decrementExact;

public class StaticTest {


    public static void main(String[] args) {

        StaticReview review=new StaticReview();
        StaticReview review1=new StaticReview();

        StaticReview.test();
        review.test1();

        test();

        System.out.println(addExact(10,-5));
       // Math.addExact(10,5);

        System.out.println(substract(10,6));
        System.out.println(divide(10,4));
        System.out.println(add(5,4));
        System.out.println(muliply(5,5));

        List<Integer> num= new ArrayList<>();

        num.add(1);
        num.add(4);
        num.add(2);

        System.out.println(num);

        Collections.sort(num);

        System.out.println(num);

    }

}
