package StaticPractice;

public class Book {

    String name;
    // i wanna only store the business books
    String kind;
    // it will be always same author (Jihm Rohn)
    String author;
    int pages;

    int count;
    //instance initialization block
    // we are using this block to initialize our instance variables
    {
        kind="Business book";
        author="Jihm Rohn";
        count++;

        System.out.println("this instance  ");

    }

    static {
        //we are using static block to initialize our instance variables.
        System.out.println("this is static block. i am running only one time");
    }
    public Book(String name, int pages){
        this.name=name;
        this.pages=pages;
    }




}
