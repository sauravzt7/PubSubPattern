package src.CricBuzz.builder;

import src.CricBuzz.models.Innings;
import src.CricBuzz.models.Team;

public class InningsBuilder {

    public int inningsId;
    public int runs;
    public int wickets;
    public int overs;
    public Team team;


    public InningsBuilder setInningsId(int inningsId) {
        this.inningsId = inningsId;
        return this;
    }

    public InningsBuilder setTeam(Team team) {
        this.team = team;
        return this;
    }

    public InningsBuilder setOvers(int overs) {
        this.overs = overs;
        return this;
    }

    public InningsBuilder setWickets(int wickets) {
        this.wickets = wickets;
        return this;
    }

    public InningsBuilder setRuns(int runs) {
        this.runs = runs;
        return this;
    }

    public Innings build(){
        return new Innings(this);
    }
}
