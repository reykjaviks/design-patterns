public interface Subject {
    public void registerFollower(Follower f);
    public void removeFollower(Follower f);
    public void notifyFollowers();
}
