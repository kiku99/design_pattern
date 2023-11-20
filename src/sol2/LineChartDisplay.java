package sol2;

import java.util.HashMap;

public class LineChartDisplay {
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void update(HashMap data){
        this.data = data;
        display();
    }

    public void display(){
        //do something
        System.out.println("line chart");
    }
}
