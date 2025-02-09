package src.CricBuzz.builder;

import src.CricBuzz.models.Innings;
import src.CricBuzz.models.Match;

import java.util.List;

public class MatchBuilder {

    public int matchId;
    public String matchName;
    public String matchType;
    public int runs;
    public int wickets;
    public int overs;
    public Innings innings1;
    public Innings innings2;
    public boolean isFirstInnings;
    public List<String> commentries;


    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public void setInnings1(Innings innings1) {
        this.innings1 = innings1;
    }

    public void setInnings2(Innings innings2) {
        this.innings2 = innings2;
    }

    public void setFirstInnings(boolean firstInnings) {
        isFirstInnings = firstInnings;
    }

    public void setCommentries(List<String> commentries) {
        this.commentries = commentries;
    }

    public Match build(){
        return new Match(this);
    }
}
