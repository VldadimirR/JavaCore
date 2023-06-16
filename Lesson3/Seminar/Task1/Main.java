package Lesson3.Seminar.Task1;

import Lesson3.Seminar.Task1.Data.Employee;
import Lesson3.Seminar.Task1.Data.Manager;
import Lesson3.Seminar.Task1.Service.EmployeeService;
import Lesson3.Seminar.Task1.Service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("RVA", "Office worker", 89043245678L, 20000, 47);
        Employee employee2 = new Employee("MGA", "Office worker", 89047995678L, 40000, 50);
        Employee employee3 = new Employee("JLA", "Office worker", 890474595678L, 40000, 25);
        Manager manager = new Manager("FLG", "Manager", 89043456745L, 40000, 55);
        Manager manager2 = new Manager("FLO", "Manager", 89045456745L, 80000, 25);
        Employee[] employees = {employee, employee2, employee3, manager, manager2};

        for (int i = 0; i < employees.length; i++) {
            Manager.increaseSalary(employees[i]);
            System.out.println(employees[i]);
        }

        System.out.println();
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.employeeAgeSort(employees);
        Employee.info(employees);

        System.out.println();
        employeeService.employeeWageSort(employees);
        Employee.info(employees);

    }
}
