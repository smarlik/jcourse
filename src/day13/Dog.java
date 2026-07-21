package day13;

public class Dog extends Animal {

    public Dog() {
        super(15); 
        System.out.println("a dog has been created");
    }

    public void eat() {
        System.out.println("a dog is eating");
     }

    //public abstract eat();

    public void sleep(){
        System.out.println("a dog is sleeping");
    }

    public void woof() {
        System.out.println("the dog says woof");
    }

    public void run() {
        System.out.println("a dog is running");
    }
}
