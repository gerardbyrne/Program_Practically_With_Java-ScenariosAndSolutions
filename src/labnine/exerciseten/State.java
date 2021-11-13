package labnine.exerciseten;

import java.io.Serializable;

public class State implements Serializable
{
    String stateName;
    String stateCapital;
    int statePopulation;

    public State(String stateName, String stateCapital, int statePopulation)
    {
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.statePopulation = statePopulation;
    } // End of constructor

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

    public String getStateCapital()
    {
        return stateCapital;
    }

    public void setStateCapital(String stateCapital)
    {
        this.stateCapital = stateCapital;
    }

    public int getStatePopulation()
    {
        return statePopulation;
    }

    public void setStatePopulation(int statePopulation)
    {
        this.statePopulation = statePopulation;
    }

    @Override
    public String toString()
    {
        return "US State Details{" +
            "stateName='" + stateName + '\'' +
            ", stateCapital='" + stateCapital + '\'' +
            ", statePopulation=" + statePopulation +
            '}';
    } // End of toString() method

} // End of State class