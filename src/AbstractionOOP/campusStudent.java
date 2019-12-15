package AbstractionOOP;

public class campusStudent extends Student{
    @Override
    public void study(){
        System.out.println("campus student is studying");
    }

    @Override
    public void attendClass(){
        System.out.println("student is taking class on campus");
    }

    @Override
    public void homework(){
        System.out.println("campus student is doing his homework");
    }




}
