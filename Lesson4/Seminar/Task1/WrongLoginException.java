package Lesson4.Seminar.Task1;

public class WrongLoginException extends Exception {
    public WrongLoginException(){

    }

    public WrongLoginException(String messages){
        super(messages);
    }
}
