package Bai1;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        System.out.println("_________Enter dog______");
        dog.input();
        System.out.println("_________Enter cat______");
        cat.input();

        System.out.println("______________Dog__________________");
        dog.output();
        dog.makeSound();
        System.out.println("______________Cat__________________");
        cat.output();
        cat.makeSound();
    }
}
