package PokerGame;

import Agent.Agent;

import java.util.ArrayList;

/**
 * Created by Bouse PC on 3/11/2016.
 */
public class Hand {

    int handID;
    ArrayList<Agent> playerList = new ArrayList<>();

    Hand(int handID, ArrayList<Agent> playerList)
    {
        this.handID = handID;
        this.playerList = playerList;
    }

    public Hand getHand()
    {
        return this;
    }

    public void print()
    {
        System.out.println("Hand ID:" + handID);
        for (Agent a: playerList) {
            System.out.print(a.getAgentID() + ": $" + a.getStackSize() + "\n");
        }
    }

}
