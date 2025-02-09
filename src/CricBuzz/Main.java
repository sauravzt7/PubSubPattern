package src.CricBuzz;

import src.CricBuzz.builder.MatchBuilder;
import src.CricBuzz.models.Match;

public class Main {
    public static void main(String[] args) {

        MatchBuilder matchBuilder = new MatchBuilder();
        matchBuilder.setMatchId(123456789);
        matchBuilder.setMatchName("Test Match");
        matchBuilder.setOvers(2);
        matchBuilder.setRuns(21305);

        Match match = matchBuilder.build();

        System.out.println(match);
        System.out.println(match.getMatchId());




    }
}
