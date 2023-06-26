package Lesson4.Seminar.Task1;

public class LoginPasswordChecker {

    public  boolean checkLoginPassword(String login, String password,String confirmPassword ) throws WrongPasswordException, WrongLoginException {
        if (login.length() > 5){
            throw new WrongLoginException("Incorrect login");
        }
        if (password.length() > 5){
            throw new WrongPasswordException("Incorrect password");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }
}
