package Exceptions;

public class CasinoAgeLimit {


    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CasinoAgeLimit(String name, int age){
        this.name=name;
        this.age=age;
    }
    public static void casinoAccess(CasinoAgeLimit ageLimit)throws Exception{
        if(ageLimit.getAge()<=21){
            throw new Exception("hey u cant play in casino!");
        }
        System.out.println(ageLimit.getName() + " Welcome to Casino! ");
    }

    public static void main(String[] args) throws Exception {

        CasinoAgeLimit casinoAgeLimit=new CasinoAgeLimit("John", 22);
        CasinoAgeLimit casinoAgeLimit1=new CasinoAgeLimit("David", 18);

        casinoAgeLimit.casinoAccess(casinoAgeLimit);
        casinoAgeLimit1.casinoAccess(casinoAgeLimit1);


        System.out.println("my code is finished");
    }
}
