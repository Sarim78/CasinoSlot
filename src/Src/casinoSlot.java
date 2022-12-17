package Src;
import java.util.Scanner;
import java.util.Random;

/**
 * Casino Slot Machine Game.
 * This is a editied version of any casino slot machine.
 * @athuor Sarim Siddiqui
 */

public class casinoSlot {

    // Creating Objects 
    static Random rnd = new Random();
    static Scanner in = new Scanner(System.in);

    // Creating Variables
    static int bet; // Player bet Variable

    static int randomMoney = 5500; // This is for random money generated, when you bet your money

    static int jackPot = 75000; // This will be a jackpot ($75k) for the slot machine. It will be very hard to win.

    static int maxBet = 20000; // Max bet that player can make is $20k
    static int minBet = 1000; // Min bet that player can make is $1k

    static int slotMachine; // Slow Machine Variable

    public static void moneyGeneratedAfterBetting() {
        int money = rnd.nextInt(randomMoney) - 300;
        int doubledMoney = money * 2; // this will double the amount of money you win 

        System.out.println("\nYou have won: " + "$" + doubledMoney);
    }

    public static void jackPot() {
        // gotta finish this last
    }

    public static void slotMachine() {
        System.out.println("\nPlease Place Your Bet: ");
        bet = in.nextInt(); 

        if(bet > maxBet) {
            System.out.println("\nYou have placed: " + "$" + bet);
            System.out.println("Sorry, you went over the limit. The maximum limit of betting was: $20k...");
        } else if (bet < minBet) {
            System.out.println("\nYou have placed: " + "$" + bet);
            System.out.println("Sorry, you went under the limit. The minimum limit of betting was: $1k...");
        } else {
            System.out.println("\nYou have placed: " + "$" + bet);
            moneyGeneratedAfterBetting();
        }
    }
}