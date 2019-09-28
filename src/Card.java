public class Card
{
    private Rank rank;
    private Suit suit;

    //no-arg constructor
    public Card ()
    {
        rank = Rank.ACE;
        suit = Suit.HEARTS;
    }

    public Card (Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    //copy constructor
    public Card(Card existingCard)
    {
        this.rank = existingCard.rank;
        this.suit = existingCard.suit;
    }

    //parameterized constructor
    public Card(int n)
    {
        rank = Rank.values()[n % 13];
        suit = Suit.values()[n % 4];
    }

    @Override
    public String toString ( )
    {
        String resultOut = "The " + rank + " of " + suit;

        return resultOut;
    } // end toString
}
