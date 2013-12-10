package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 2:13 PM
 */
public class Person {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surName='" + surName + '\'' +
                '}';
    }

    public static List<Person> createShortList() {

        List<Person> persons = new ArrayList<>();


        Person e = new Person();
        e.setSurName("Kowalski");
        persons.add(e);

        e = new Person();
        e.setSurName("Nowak");
        persons.add(e);

        e = new Person();
        e.setSurName("Jagiełło");
        persons.add(e);

        return persons;
    }


}
