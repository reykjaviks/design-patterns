public class Author implements Subject {
    private String name;
    private Message feed;

    @Override
    public void registerFollower(Follower f) {
    }

    @Override
    public void removeFollower(Follower f) {
    }

    @Override
    public void notifyFollowers() {
    }
}
