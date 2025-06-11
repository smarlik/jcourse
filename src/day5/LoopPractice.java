package day5;

public class LoopPractice {

    public static void practiceWhileLoop() {
        System.out.println("\n while loop");
        int x= 0;
        while(x<5){
            System.out.println("the value of x is: "+ x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        System.out.println("\n do while loop");
        int x= 0;
        do {
            System.out.println("the value of x is: "+x);
            x++;
        } while (x<10);
    }

    public static void practiceForLoop() {
        System.out.println("\n for loop");
        for(int x=0; x<10; x++) {
            for(int y=0; y<10;y++) {
                System.out.printf("("+x+","+y+")");
            }
        }
    }

    public static void main(String[] args) {
        practiceDoWhileLoop();
        practiceWhileLoop();
        practiceForLoop();
    }
}
