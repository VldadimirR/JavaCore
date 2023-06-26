package Lesson4.Seminar.Task2;


public class Customer {
    private String firstName;
    private String lastName;
    private String Phone;
    private Gender gender;
    private int age;

    public Customer(String firstName, String lastName, int age, String phone, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        Phone = phone;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return "[First Name: " + this.firstName +
                ", Last Name: " + this.lastName +
                ", Age: " + this.age +
                ", Phone: " + this.Phone +
                ", Gender: " + this.gender + "]";
    }

}

enum Gender {MEN, WOMAN}

