package day12;

public class Dog extends Animal {

    public Dog() {
        super(15); 
        System.out.println("a dog has been created");
    }

    public void woof() {
        System.out.println("the dog says woof");
    }

    public void run() {
        System.out.println("a dog is running");
    }
}
