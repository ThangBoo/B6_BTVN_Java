package Bai1;

import java.util.Scanner;

public class Dog extends Animals {
    private String character;

    public Dog() {
    }

    public Dog(String name, Byte age, float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu gâu!!!");
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        setCharacter(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Character: " + getCharacter());
    }
}
