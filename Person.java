package oop_hw_1;

public abstract class Person {
    int age;
    String firstname;
    String lastname;
    String gender;
    String relation;
    String nationality;

    public Person(int age, String firstname, String lastname, String gender, String relation, String nationality) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.relation = relation;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "age" + age + ", firstname" + firstname + ", lastname" + lastname +
                ", gender" + gender + ", relation" + relation + ", nationality" + nationality;


    }
}