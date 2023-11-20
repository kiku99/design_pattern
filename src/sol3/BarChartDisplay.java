package sol3;

import java.util.HashMap;

public class BarChartDisplay implements Observer{
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void update(HashMap data){
        this.data = data;
        display();
    }

    public void display(){
        System.out.println("Bar Chart");
    }
}
