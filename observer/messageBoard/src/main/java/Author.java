import java.util.ArrayList;
import java.util.List;

public class Author implements Subject {
    private String name;
    private ArrayList<Message> messageList;
    private ArrayList<Observer> observerList;

    public  Author(String name) {
        this.name = name;
        messageList = new ArrayList<Message>();
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerFollower(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeFollower(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyFollowers() {
        for (Observer o : this.observerList) {
            o.update();
        }
    }
}
