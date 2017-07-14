/**
 * Created by Grand Circus Student on 7/13/2017.
 */
import java.util.Random;
import java.util.Scanner;
public class DiceRoll {

    public static void main (String [] args) {
        int zero = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println("Please enter the number of sides for a pair of dice: ");
        int diceSideNum = scan.nextInt();
        System.out.println("There are " + diceSideNum + " sides to each of your die.");

        if (rollDie(diceSideNum) == zero)
        { System.out.println(0 + 1);
        } else System.out.println(rollDie(diceSideNum));

        if (rollDie(diceSideNum) == zero){
            System.out.println(0 + 1);
        } else System.out.println(rollDie(diceSideNum));
    }


    public static int rollDie(int a) {

        Random randNum = new Random();
        return randNum.nextInt(a);

    }

    }





