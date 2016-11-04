package Agent;

/**
 * Created by Bouse PC on 3/11/2016.
 */
public class Agent {
    private int agentID;
    private String agentName;
    private Boolean isActive;
    private float stackSize;

    Agent(int agentID, float startingStack, String agentName)
    {
        this.agentID = agentID;
        stackSize = startingStack;
        this.agentName = agentName;
    }

    Agent(int agentID, float startingStack)
    {
        this.agentID = agentID;
        stackSize = startingStack;
    }

    Agent()
    {

    }

    //Getters and Setters
    public float getStackSize() {
        return stackSize;
    }

    public String getAgentName()
    {
        return agentName;
    }
    public int getAgentID()
    {
        return agentID;
    }


}
