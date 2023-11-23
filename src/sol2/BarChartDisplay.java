package sol2;

import java.util.HashMap;

public class BarChartDisplay {
    HashMap<String, Integer> data = new HashMap<String, Integer>();

    public void update(HashMap data){
        this.data = data;
        display();
    }

    public void display(){
        //do something
        System.out.println("bar chart");
    }
}
