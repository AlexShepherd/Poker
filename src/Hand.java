public class Hand
{
    private int handSize;
    private int cardsInHand;
    private Card [] hand;

    public Hand ()
    {
        handSize = 2;
        cardsInHand = 0;
        hand = new Card[handSize];
    }

    public Hand(int handSize)
    {
        if(handSize >= 1 && handSize <= 52)
        {
            this.handSize = handSize;
            hand = new Card[handSize];
            for (int i = 0; i < hand.length; i++)
            {
                hand[i] = new Card(i);
            }
        }
    }

    public Hand (Hand HandIn)
    {
        this.cardsInHand = HandIn.cardsInHand;
        this.handSize = HandIn.handSize;
        for (int i = 0; i < hand.length; i++)
        {
            hand[i] = HandIn.hand[i];
        }
    }

    public void addCard(Card card)
    {
        if(this.cardsInHand < this.handSize)
        {
            this.hand[cardsInHand] = card;
            this.cardsInHand++;
        }
        else
        {
            System.out.println("Hand is already full");
        }
    }

    @Override
    public String toString ()
    {
        String resultOut = "";
        for (Card i : hand)
        {
            resultOut += "\t" + i + "\n";
        }
        return resultOut;
    }
}
