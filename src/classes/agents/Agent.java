package classes.agents;

/*
This is the Agents class which has properties related to
an agent and has one constructor
*/
public class Agent
{
    private long agentId;
    private String agentName;
    private String agentEmail;
    private String agentTelephone;
    private String agentRegion;
    private boolean goldAgentStatus;

    /*
    Add a constructor that now causes the default constructor
    to not exist, it is effectively over ridden
    */

    public Agent(long agentId, String agentName, String agentEmail, String agentTelephone, String agentRegion, boolean goldAgentStatus)
    {
        this.agentId = agentId;
        this.agentName = agentName;
        this.agentEmail = agentEmail;
        this.agentTelephone = agentTelephone;
        this.agentRegion = agentRegion;
        this.goldAgentStatus = goldAgentStatus;
    } // End of custom constructor


    /* This getter method is used to return the value of the agent id property */
    public long getAgentId()
    {
        return agentId;
    }

    /* This setter method is used to amend the value of the agent id property */
    public void setAgentId(long agentId)
    {
        this.agentId = agentId;
    }

    /* This getter method is used to return the value of the agent name property */
    public String getAgentName()
    {
        return agentName;
    }

    /* This setter method is used to amend the value of the agent name property */
    public void setAgentName(String agentName)
    {
        this.agentName = agentName;
    }

    /* This getter method is used to return the value of the agent email property */
    public String getAgentEmail()
    {
        return agentEmail;
    }

    /* This setter method is used to amend the value of the agent email property */
    public void setAgentEmail(String agentEmail)
    {
        this.agentEmail = agentEmail;
    }

    /* This getter method is used to return the value of the agent telephone number property */
    public String getAgentTelephone()
    {
        return agentTelephone;
    }

    /* This setter method is used to amend the value of the agent telephone property */
    public void setAgentTelephone(String agentTelephone)
    {
        this.agentTelephone = agentTelephone;
    }

    /* This getter method is used to return the value of the agent region property */
    public String getAgentRegion()
    {
        return agentRegion;
    }

    /* This setter method is used to amend the value of the agent region property */
    public void setAgentRegion(String agentRegion)
    {
        this.agentRegion = agentRegion;
    }

    /* This getter method is used to return the value of the agent status property */
    public boolean getGoldAgentStatus()
    {
        return goldAgentStatus;
    }

    /* This setter method is used to amend the value of the agent status property */
    public void setGoldAgentStatus(boolean goldAgentStatus)
    {
        this.goldAgentStatus = goldAgentStatus;
    }

    @Override
    public String toString()
    {
        return "Agents{" +
            "agentId=" + agentId + "," + "\n" +
            "agentName=" + agentName + "," + "\n" +
            "agentEmail=" + agentEmail + "," + "\n" +
            "agentTelephone=" + agentTelephone + "," + "\n" +
            "agentRegion=" + agentRegion + "," + "\n" +
            "goldAgentStatus=" + goldAgentStatus + "," + "\n" +
            '}';
    }
} // End of Agent class
