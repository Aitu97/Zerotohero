package InheritanceOOP3;

public class staticBlock {

    String name;
    public static final String LEGALSTATUS;

   static  {
        LEGALSTATUS="Citizen";
       System.out.println("im static block from StaticBlock class");
    }
    {
        System.out.println("im instance block of StaticBlock class");
    }

        public staticBlock(){
            System.out.println("im constructor of StaticBlock class");
    }





}
