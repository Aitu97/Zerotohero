package InheritanceOOP2;

public class camry extends car{

    public camry(){
        super();
    }
    @Override
    public Integer velocity(){
        return 125;
    }
    @Override
    public String carName(){
        return "Camry";
    }

}
