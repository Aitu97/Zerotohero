package InheritanceOOP;

public class WildAnimal extends Animal{

    //it is important to write @Override
    //it is Annotation
    @Override
    public void eat(){
        System.out.println("Wild Animal is eating meat");
    }

    @Override
    public void sleep(){
        System.out.println("Wild animal is not sleeping");
    }

    public void fight() {
        System.out.println("wild animal is fighting");
    }



}
