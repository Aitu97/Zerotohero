package PolymorphysymOOP2;

import java.util.*;
import java.util.Collection;
import java.util.Set;
import java.util.ArrayList;

public class Family {

    public static void main(String[] args) {

        Human human=new Baby();
        human.eat();
        human.shave();
        human.walk();

        ((Baby)human).crawl();
       // ((Women)human).makeUp();

        System.out.println("=============");

        Men men=new Boy();
        men.playSport();
        ((Boy)men).cry();
        ((Human)men).eat();

        System.out.println("============");

        Dad dad=new Baby();
        dad.feed();
        ((Boy)dad).run();

        Collection coll=new ArrayList();
        coll.add(2);
        coll.add(5);
        coll.add(10);

        ((Set)coll).add(2);

    }
}
