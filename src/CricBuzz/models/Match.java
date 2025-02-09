package src.CricBuzz.models;

import src.CricBuzz.builder.MatchBuilder;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private int matchId;
    private String matchName;
    private String matchType;
    private int runs;
    private int wickets;
    private int overs;
    private Innings innings1;
    private Innings innings2;
    private boolean isFirstInnings;
    private List<String> commentries;


    public Match(MatchBuilder builder) {
        this.matchId = builder.matchId;
        this.matchName = builder.matchName;
        this.matchType = builder.matchType;
        this.runs = builder.runs;
        this.wickets = builder.wickets;
        this.overs = builder.overs;
        this.innings1 = builder.innings1;
        this.innings2 = builder.innings2;
        this.isFirstInnings = builder.isFirstInnings;
        this.commentries = builder.commentries != null ? builder.commentries : new ArrayList<>();
    }



    public List<String> getCommentries() {
        return commentries;
    }

    public void setCommentries(List<String> commentries) {
        this.commentries = commentries;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
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

    public Innings getInnings1() {
        return innings1;
    }

    public void setInnings1(Innings innings1) {
        this.innings1 = innings1;
    }

    public Innings getInnings2() {
        return innings2;
    }

    public void setInnings2(Innings innings2) {
        this.innings2 = innings2;
    }


    public boolean isFirstInnings() {
        return isFirstInnings;
    }

    public void setFirstInnings(boolean firstInnings) {
        isFirstInnings = firstInnings;
    }
}
