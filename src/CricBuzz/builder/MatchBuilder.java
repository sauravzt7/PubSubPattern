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


    public MatchBuilder setMatchId(int matchId) {
        this.matchId = matchId;
        return this;
    }

    public MatchBuilder setMatchName(String matchName) {
        this.matchName = matchName;
        return this;
    }

    public MatchBuilder setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    public MatchBuilder setRuns(int runs) {
        this.runs = runs;
        return this;
    }

    public MatchBuilder setWickets(int wickets) {
        this.wickets = wickets;
        return this;
    }

    public MatchBuilder setOvers(int overs) {
        this.overs = overs;
        return this;
    }

    public MatchBuilder setInnings1(Innings innings1) {
        this.innings1 = innings1;
        return this;
    }

    public MatchBuilder setInnings2(Innings innings2) {
        this.innings2 = innings2;
        return this;
    }

    public MatchBuilder setFirstInnings(boolean firstInnings) {
        isFirstInnings = firstInnings;
        return this;
    }

    public MatchBuilder setCommentries(List<String> commentries) {
        this.commentries = commentries;
        return this;
    }

    public Match build(){
        return new Match(this);
    }
}
