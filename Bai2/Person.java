package Bai2;

import java.util.Scanner;

public class Person {
    protected String name;
    protected Byte age;
    protected String address;
    protected Date birthday;

    public Person(String name, Byte age, String address, Date birthday) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    public Person() {
        this.birthday = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Enter age: ");
        this.age = Byte.parseByte(sc.nextLine());
        System.out.println("Enter address: ");
        this.address = sc.nextLine();
        System.out.println("Enter birthday: ");
        birthday.input();
    }

    public void output() {
        System.out.printf("%-15s %-10d %-15s", name, age, address);
        birthday.output();

    }
}
