package PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Bouse PC on 3/11/2016.
 */
public class Deck
{
    private ArrayList deck;

    public Deck ()
    {
       deck = deckInit();
    }

    public Card getRandomCard()
    {
        Random random = new Random();
        //Returns Card Object
        return null;
    }

    public void shuffleDeck()
    {
        Collections.shuffle(deck);
    }

    private ArrayList<Card> deckInit()
    {
        ArrayList<Card> tempDec = new ArrayList<Card>();
        for (int i = 0; i < 13; i++)
        {
            Card.Value value = Card.Value.values()[i];

            for (int j=0; j < 4; j++)
            {
                Card card = new Card(value, Card.Suit.values()[j]);
                tempDec.add(card);
            }
        }
        return tempDec;
    }



}
