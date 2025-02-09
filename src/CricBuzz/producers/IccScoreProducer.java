package src.CricBuzz.producers;

import src.CricBuzz.models.Match;
import src.CricBuzz.subscribers.CricBuzzScoreSubscriber;
import src.CricBuzz.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class IccScoreProducer implements Producer{
    
    Match match;
    private List<Subscriber> subscriberList;


    public IccScoreProducer(Match match) {
        this.match = match;
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(){
        for(Subscriber subscriber : subscriberList){
            subscriber.update(this);
        }
    }


    public Match getMatchData() {
        return this.match;
    }
}
