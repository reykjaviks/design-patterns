import domain.Author;
import domain.Follower;

public class Main {
    public static void main(String[] args) {
        Author eeCummings = new Author("E.E. Cummings");

        Follower elizaditty = new Follower("elizaditty");
        Follower kocu = new Follower("Kocu");
        Follower sindex = new Follower("Sindex");

        // elizaditty, kocu and sindex want to start following E.E. Cummings' posts.
        eeCummings.registerObserver(elizaditty);
        eeCummings.registerObserver(kocu);
        eeCummings.registerObserver(sindex);

        eeCummings.write("One's not half of two; two are halves of one.");
        eeCummings.notifyObservers();

        elizaditty.printFeed();
        kocu.printFeed();
        sindex.printFeed();
    }
}
