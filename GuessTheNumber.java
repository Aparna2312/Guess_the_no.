import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class GuessTheNumber{
    int theNumber;
    int max;
    Scanner scan = new Scanner(System.in);

    public GuessTheNumber() {
        Random r1 = new Random();
        max = 100;
        theNumber = Math.abs(r1.nextInt()) % (max + 1);}
        public void play () {
            while (true) {
                int move = scan.nextInt();
                if (move < theNumber) {
                    System.out.println("The no is big");
                } else if (move > theNumber) {
                    System.out.println("the no. is small");
                } else {
                    System.out.println("got the no.");
                    break;
                }
            }
        }
        public static void main (String[]args){
            GuessTheNumber gameguess = new GuessTheNumber();
            System.out.println("welcome to my GAME!!");
            gameguess.play();
        }

}