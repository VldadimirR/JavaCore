package Lesson3.Seminar.Task1.Comparator;

import Lesson3.Seminar.Task1.Data.Employee;

import java.util.Comparator;

public class EmployeeWageComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee employee2) {
        return employee.getSalary() - employee2.getSalary();
    }
}
