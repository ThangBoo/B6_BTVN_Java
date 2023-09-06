package Bai1;

import java.util.Scanner;

public class Animals {
    protected String name;
    protected Byte age;
    protected float weight;

    public Animals() {
    }

    public Animals(String name, Byte age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animals....");
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        System.out.println("Enter age: ");
        setAge(sc.nextByte());
        System.out.println("Enter weight: ");
        setWeight(sc.nextFloat());
    }

    public void output() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
    }
}
