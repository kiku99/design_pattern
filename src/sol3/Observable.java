package sol3;
import java.util.ArrayList;

public class Observable implements Subject{
    ArrayList<Observer> observerList;

    public Observable(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o){
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(String data) {
        for (Observer o : observerList) {
            o.update(data);
        }
    }

    public void receiveData(String data){
        notifyObservers(data);
    }
}
