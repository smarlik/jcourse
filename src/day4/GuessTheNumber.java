package day4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random(); 
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if(move > theNUMBER) {
                System.out.println("the number is too big");
            }else if(move < theNUMBER) {
                System.out.println("the number is too small");
            }else {
                System.out.println("that is the number");
                break;
            }
        } 
    }

    public static void howBigIsTheNumber(int x) {
        if(x>= 0 && x<= 10) {
            System.out.println("The number is pretty small");
        } else if(x >= 11 && x <= 100) {
            System.out.println("The number is pretty big");
        } else {
            System.out.println("The number is out of range");
        } 

    }

    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("try to guess the number \nit will be between 0 and "+ guessGame.max);
        guessGame.play();
    }

}
