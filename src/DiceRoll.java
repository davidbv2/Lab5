/**
 * Created by Grand Circus Student on 7/13/2017.
 */
import java.util.Random;
import java.util.Scanner;
public class DiceRoll {

    public static void main(String[] args) {
        int zero = 0;
        String answer = " ";
        Scanner scan = new Scanner(System.in);

        //start do while loop, while


            System.out.println("Welcome to the Grand Circus Casino!");

            do {

            System.out.println("Please enter the number of sides for a pair of dice: ");
            int diceSideNum = scan.nextInt();
            scan.nextLine();
            System.out.println("There are " + diceSideNum + " sides to each of your die.");

            System.out.println(rollDie(diceSideNum));
            System.out.println(rollDie(diceSideNum));

            System.out.println("Would you like to continue? Please enter 'yes' or 'no'.");
            answer = scan.nextLine();

            System.out.println();

        } while (answer.equalsIgnoreCase("yes"));

    }

    public static int rollDie(int a) {

        Random randNum = new Random();
        return (randNum.nextInt(a)) + 1;

    }

    }





