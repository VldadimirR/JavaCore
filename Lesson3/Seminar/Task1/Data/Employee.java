package Lesson3.Seminar.Task1.Data;

public class Employee {
    private String FIO;
    private String jobTitle;
    private long numberPhone;
    private int salary;
    private int age;

    public Employee(String FIO, String jobTitle, long numberPhone, int salary, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "[FIO: " + this.FIO +
                ", Job Title: " + this.jobTitle +
                ", Number Phone: " + this.numberPhone +
                ", Salary: " + this.salary +
                ", Age: " + this.age + "]";
    }

    public static void info(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void increaseSalary(Employee employees, int age, int salary) {
        if (employees.getAge() > age) {
            employees.setSalary(employees.getSalary() + salary);
        }
    }

}
