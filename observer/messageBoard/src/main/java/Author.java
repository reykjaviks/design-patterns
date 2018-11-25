public class Author implements Subject {
    private String name;
    private Message feed;

    @Override
    public void registerFollower(Observer o) {
    }

    @Override
    public void removeFollower(Observer o) {
    }

    @Override
    public void notifyFollowers() {
    }
}
