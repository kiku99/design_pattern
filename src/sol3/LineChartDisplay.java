package sol3;

import java.util.HashMap;

public class LineChartDisplay implements Observer{
    HashMap<String, Integer> data = new HashMap<String, Integer>();

    public void update(HashMap data){
        this.data = data;
        display();
    }

    public void display(){
        System.out.println("Line Chart");
    }
}
