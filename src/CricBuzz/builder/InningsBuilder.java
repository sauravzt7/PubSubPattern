package src.CricBuzz.builder;

import src.CricBuzz.models.Innings;
import src.CricBuzz.models.Team;

public class InningsBuilder {

    public int inningsId;
    public int runs;
    public int wickets;
    public int overs;
    public Team team;


    public void setInningsId(int inningsId) {
        this.inningsId = inningsId;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public Innings build(){
        return new Innings(this);
    }
}
