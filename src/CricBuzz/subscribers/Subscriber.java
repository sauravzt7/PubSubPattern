package src.CricBuzz.subscribers;

import src.CricBuzz.producers.ScoreProducer;

public interface ScoreSubscriber {

    void updateScore(ScoreProducer producer);
}
