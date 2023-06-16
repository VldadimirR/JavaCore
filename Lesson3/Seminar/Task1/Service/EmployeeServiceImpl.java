package Lesson3.Seminar.Task1.Service;

import Lesson3.Seminar.Task1.Comparator.EmployeeAgeComparator;
import Lesson3.Seminar.Task1.Comparator.EmployeeWageComparator;
import Lesson3.Seminar.Task1.Data.Employee;

import java.util.Arrays;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void employeeAgeSort(Employee[] employees) {
        Arrays.sort(employees, new EmployeeAgeComparator());
    }

    @Override
    public void employeeWageSort(Employee[] employees) {
        Arrays.sort(employees, new EmployeeWageComparator());
    }
}
