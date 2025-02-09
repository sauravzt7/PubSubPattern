package src.CricBuzz.subscribers;

import src.CricBuzz.models.Innings;

import java.util.ArrayList;
import java.util.List;
import src.CricBuzz.models.Match;
import src.CricBuzz.producers.IccScoreProducer;
import src.CricBuzz.producers.Producer;;

public class CricBuzzScoreSubscriber implements Subscriber {


    private final Match match;

    private List<Producer> producerList;

    public CricBuzzScoreSubscriber(Match match, List<Producer> producerList){
        this.match = match;
        this.producerList = producerList;
        for(Producer producer : producerList){
            producer.addSubscriber(this);
        }
    }


    public void update(Producer producer){

        Innings producerInnings = match.isFirstInnings() ? producer.getMatchData().getInnings1() : producer.getMatchData().getInnings2();
        Innings subscriberInnings = match.isFirstInnings() ? this.match.getInnings1() : this.match.getInnings2();

        subscriberInnings.setRuns(producerInnings.getRuns());
        subscriberInnings.setWickets(producerInnings.getWickets());
        subscriberInnings.setOvers(producerInnings.getOvers());

    }

}
