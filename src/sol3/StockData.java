package sol3;
import java.util.ArrayList;
import java.util.HashMap;

public class StockData implements Subject{
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    ArrayList<Observer> observerList;

    public StockData(){
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
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(data);
        }
    }

    private HashMap getData(){
        return data;
    }

    public void dataChanged(){
        data = getData();
        notifyObservers();
    }
}
