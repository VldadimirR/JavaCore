package Lesson4.Seminar.Task1;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){

    }

    public WrongPasswordException(String messages){
        super(messages);
    }
}
