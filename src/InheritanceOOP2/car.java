package InheritanceOOP2;

public class car extends vehicle {

    public car(){
        super("My car");
    }

    public car(String make){
        super("lexus");
}
    public Integer velocity(){
        return 100;
}
    public String carName(){
        return "car";
}


}
