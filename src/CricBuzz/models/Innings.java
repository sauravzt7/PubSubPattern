package src.CricBuzz.models;

import src.CricBuzz.builder.InningsBuilder;

public class Innings {

    private int inningsId;
    private int runs;
    private int wickets;
    private int overs;
    private Team team;

    public Innings(InningsBuilder builder){
        this.inningsId = builder.inningsId;
        this.runs = builder.runs;
        this.wickets = builder.wickets;
        this.overs = builder.overs;
        this.team = builder.team;
    }

    public int getInningsId() {
        return inningsId;
    }

    public void setInningsId(int inningsId) {
        this.inningsId = inningsId;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
