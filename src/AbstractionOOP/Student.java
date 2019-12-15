package AbstractionOOP;

public  abstract class Student {

    int studentID;
    String studentName;

    public abstract void study();

    abstract void attendClass();

    public void homework(){
        System.out.println("i have to do my homework before coming to class!");
    }



}
