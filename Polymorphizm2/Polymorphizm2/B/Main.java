package Polymorphizm2.B;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.souds("bow bow");
        dog.getName("reks");

        Cat cat = new Cat();
        cat.souds("meow meow");
        cat.getName("tisen");

        Duck duck = new Duck();
        duck.souds("quaq quaq");
        duck.getName("fyure");
    }
}
