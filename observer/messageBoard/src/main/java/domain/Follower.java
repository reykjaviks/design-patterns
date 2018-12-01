package domain;

import java.util.ArrayList;
import java.util.List;

public class Follower implements Observer {
    private String username;
    private List<String> feed;

    public Follower(String username) {
        this.username = username;
        this.feed = new ArrayList<>();
    }

    @Override
    public void update(String post) {
        feed.add(post);
    }

    public void printFeed() {
        for (String message : feed) {
            System.out.println(message);
        }
    }

}
