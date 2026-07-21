package day13;

public abstract class Animal {
    public int age;

    public Animal(int age) {
        this.age= age;
        System.out.println("an animal has been created");
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("an animal is sleeping");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.woof();

         Object str = "est";
        String realS = (String) str;
        realS.getBytes();
        
        // What happens when...
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    
    }
}