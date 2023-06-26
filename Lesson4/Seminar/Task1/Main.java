package Lesson4.Seminar.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner= new Scanner(System.in);
        LoginPasswordChecker logPawCheck = new LoginPasswordChecker();

        try {
            System.out.println(logPawCheck.checkLoginPassword(scanner.next(), scanner.next(), scanner.next()));
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }


    }
}
