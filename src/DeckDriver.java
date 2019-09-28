import java.util.Scanner;

public class DeckDriver
{
    public static void main (String [ ] args)
    {
        int handSize = 2;

        //creates a new scanner
        Scanner a = new Scanner(System.in);

        //creates a shallow copy to use deck class methods
        Deck deck = new Deck();

        //asks the user how many players
        System.out.println("How many players are playing?");
        int players = a.nextInt();

        //displays error if not enough cards
        while (players * handSize > 52)
        {
            System.out.println("There are not enough cards to deal " + players + " hands of " + handSize + " cards. Try again. \n\n");
            System.out.println("How many players are playing?");
            players = a.nextInt();
        }

        //displays the cards that each player has in their opening hand
        for (int i = 0; i < players; i++)
        {
            System.out.println("Player " + (i+1) + ":");
            System.out.println(deck.dealAHand(handSize));
        }
    }
}
