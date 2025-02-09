package src.CricBuzz.producers;

import src.CricBuzz.models.Match;
import src.CricBuzz.subscribers.Subscriber;

public interface Producer {

    Match getMatchData();

    void notifySubscriber();

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);
}
