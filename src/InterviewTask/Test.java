package InterviewTask;

import ForLoop.ParameterNumber;

public class Test {

    public static void main(String[] args) {


        ProgrammerTeacher programmerTeacher=new ProgrammerTeacher();
        programmerTeacher.addAllLanguages("java");

        Programmer programmer=new Programmer();

        System.out.println( programmerTeacher.teach(programmer,"java"));


    }
}
