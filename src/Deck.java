import java.util.Random;


public class Deck
{
    private Card[] deck;
    private int nextCard;

    public Deck()
    {
        deck = new Card[52];
        for(int i = 0; i < 52; i++)
        {
            deck[i] = new Card(i);
        }
        nextCard = 0;
        shuffle();
    }

    public Deck(Deck existingDeck)
    {
        this.deck= existingDeck.deck;
        this.nextCard = existingDeck.nextCard;
    }

    public void shuffle()
    {
        Card card;
        Random ran = new Random();
        for (int i = 0; i < 52; i++)
        {
            int temp = ran.nextInt(52);
            card = deck[i];
            deck[i] = deck[temp];
            deck[temp] = card;
        }
        nextCard = 0;
    }

    public Card dealACard(Card card)
    {
        if (nextCard < 53)
        {
            nextCard++;
        }
        return deck[nextCard -1];
    }

    public Hand dealAHand(int handSize)
    {
        Hand hand = new Hand(handSize);
        for(int i = 0; i < handSize; i++)
        {
            Card card = new Card(i);
            hand.addCard(dealACard(card));
        }
        return hand;
    }

    @Override

    public String toString ()
    {
        String hand = "";
        for(int i = 0; i < 52; i++)
        {
            hand += deck[i].toString()+"\n";
        }
        return hand;
    }
}
