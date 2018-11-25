public interface Subject {
    public void registerFollower(Observer o);
    public void removeFollower(Observer o);
    public void notifyFollowers();
}
