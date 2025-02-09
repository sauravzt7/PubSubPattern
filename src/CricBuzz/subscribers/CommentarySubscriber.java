package src.CricBuzz.subscribers;

import src.CricBuzz.producers.Producer;

import java.util.List;

public class CommentarySubscriber implements Subscriber {

    List<String> commentries;

    List<Producer> producerList;


    public CommentarySubscriber(List<String> commentries, List<Producer> producerList){
        this.commentries = commentries;
        this.producerList = producerList;

        for(Producer producer : producerList){
            producer.addSubscriber(this);
        }
    }


    @Override
    public void update(Producer producer) {
        this.commentries.add(producer.getMatchData().getCommentries().get(producer.getMatchData().getCommentries().size() - 1));
    }
}
