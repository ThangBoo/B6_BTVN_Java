package Bai1;

import java.util.Scanner;

public class Cat extends Animals {
    private String color;
    private String preferences;
    private String ownerName;

    public Cat() {
    }

    public Cat(String name, Byte age, float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo!!!");
    }


    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color: ");
        setColor(sc.nextLine());
        System.out.println("Enter preferences: ");
        setPreferences(sc.nextLine());
        System.out.println("Enter owner's name: ");
        setOwnerName(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Color: " + getColor());
        System.out.println("preferences: " + getPreferences());
        System.out.println("Owner's name: " + getOwnerName());
    }
}
