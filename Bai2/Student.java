package Bai2;

import java.util.Scanner;

public class Student extends Person {
    private String id;
    private String class_;
    private String school;

    public Student(String name, Byte age, String address, Date birthday, String id, String class_, String school) {
        super(name, age, address, birthday);
        this.id = id;
        this.class_ = class_;
        this.school = school;
    }

    public Student() {
    }

    @Override
    public void input() {
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id=sc.nextLine();
        System.out.println("Enter class: ");
        this.class_=sc.nextLine();
        System.out.println("Enter school: ");
        this.school=sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("      %-15s %-10s %-15s %n",id,class_,school);
    }
}
