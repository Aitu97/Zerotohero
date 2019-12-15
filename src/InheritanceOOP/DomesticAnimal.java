package InheritanceOOP;

public class DomesticAnimal extends Animal{

@Override
    public void eat(){
    System.out.println("domestic animal is eating meat");
}
@Override
    public void sleep(){
    System.out.println("domestic animal sleeping");
}
@Override
    public void run(){
    System.out.println("domestic animal is running");
}

}
