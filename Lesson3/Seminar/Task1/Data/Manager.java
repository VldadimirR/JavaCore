package Lesson3.Seminar.Task1.Data;

public class Manager extends Employee {

    public Manager(String FIO, String jobTitle, long numberPhone, int salary, int age) {
        super(FIO, jobTitle, numberPhone, salary, age);
    }

    public static void increaseSalary(Employee employees) {
        if (employees instanceof Manager) {
            increaseSalary(employees, 45, 0);
        } else {
            increaseSalary(employees, 45, 5000);
        }
    }




}
