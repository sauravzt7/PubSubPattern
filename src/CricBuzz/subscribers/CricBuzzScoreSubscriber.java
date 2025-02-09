package src.CricBuzz.subscribers;

import src.CricBuzz.models.Innings;
import src.CricBuzz.models.Match;
import src.CricBuzz.producers.ScoreProducer;

public class CricBuzzScoreSubscriber implements ScoreSubscriber{


    private final Match match;

    public CricBuzzScoreSubscriber(Match match){
        this.match = match;
    }


    public void updateScore(ScoreProducer producer){

        Innings producerInnings = match.isFirstInnings() ? producer.getMatchData().getInnings1() : producer.getMatchData().getInnings2();
        Innings subscriberInnings = match.isFirstInnings() ? this.match.getInnings1() : this.match.getInnings2();

        subscriberInnings.setRuns(producerInnings.getRuns());
        subscriberInnings.setWickets(producerInnings.getWickets());
        subscriberInnings.setOvers(producerInnings.getOvers());
        

    }

}
