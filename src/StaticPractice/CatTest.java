package StaticPractice;

public class CatTest {

    public static void main(String[] args) {

        Cat dodo=new Cat();
        Cat princess=new Cat();

        System.out.println(dodo.kitKab);
        System.out.println(princess.kitKab);
        System.out.println(Cat.meowMix);


       //dodo ate 2kg meals meowMix
       Cat.eatMix(2);
       Cat.eatMix(5);
       //meowMix --> 3
      // Cat.eatMix(1);
      // Cat.eatMix(0);

       dodo.eatKit(6); //2

       princess.eatKit(5); //3

       princess.eatMix(2); //2

    }
}
