package PokerGame;

import Agent.Agent;

import java.util.ArrayList;

/**
 * Created by Bouse PC on 3/11/2016.
 */

public class Table {
    int tableID;
    static final int MAX_PLAYERS = 9;
    ArrayList<Agent> playerList = new ArrayList<Agent>();
    ArrayList<Hand> handHistory = new ArrayList<Hand>();


    public Table voidGetTable()
    {
        return this;
    }

    public Table(int tableID)
    {

    }
    //Moves the last place to first place.
    private void newRound()
    {
        playerList.add(0,playerList.get(playerList.size()));
        playerList.remove(playerList.size());
        playerList.trimToSize();
    }
}

