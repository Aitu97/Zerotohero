package Exceptions;

public class MyException extends RuntimeException {

    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "this is my exception's message.";
    }
    public static void main(String [] args){
        throw new MyException("im throwing my exception");
    }
}
