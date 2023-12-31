package sol3;

public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers(String s);
}
