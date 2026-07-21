package day12;

public class Cat extends Animal{

    public Cat() {
        super(9);
        System.out.println("a cat has been created");
    }

    public void meow() {
        System.out.println("a kitty meows");
    }

    public void prance() {
        System.out.println("a kitty prances");
    }
}
