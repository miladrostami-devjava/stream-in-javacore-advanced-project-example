package org.example;

public class PersonTwo {
    private String firstName;
    private String lastName;
    private String city;
    private Long salary;
    private Gender gender;

     enum Gender{
     FEMALE,MALE
    }


    public PersonTwo() {
    }

    public PersonTwo(String firstName, String lastName, String city, Long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.salary = salary;
    }

    public PersonTwo(String firstName, String lastName, String city, Long salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.salary = salary;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                " ,gender=" + gender +
                '}';
    }
}

