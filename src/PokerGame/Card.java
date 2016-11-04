package PokerGame;

/**
 * Created by Bouse PC on 3/11/2016.
 */
public class Card {

    public enum Value {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private int cardValue;

        private Value (int value)
        {
            this.cardValue = value;
        }

        public int getCardValue() {
            return cardValue;
        }
    }
    public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;


    }

        private Suit suit;
        private Value cardValue;

        public Card (Value cardValue, Suit suit)
        {
            this.cardValue = cardValue;
            this.suit = suit;
        }

        public Suit getSuit()
        {
            return suit;
        }

        public void setSuit(Suit suit)
        {
            this.suit = suit;
        }

        public Value getCardValue()
        {
            return cardValue;
        }

        public void setCardValue(Value cardValue)
        {
            this.cardValue = cardValue;
        }
    }
