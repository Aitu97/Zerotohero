package InheritanceOOP;

public class Lion extends WildAnimal{

    @Override
    public void eat(){
        System.out.println("lion is eating meat");
    }

    public void roar(){
        System.out.println("Lion is roaring");
    }
}
