package sol1;


import java.util.HashMap;

public class CricketData {

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    private HashMap getData(){
        return data;
    }

    public void lineChartDisplay(HashMap data){
        //do something
        System.out.println("line chart");
    }

    public void barChartDisplay(HashMap data){
        //do something
        System.out.println("bar chart");
    }

    public void dataChanged(){
        data = getData();

        lineChartDisplay(data);
        barChartDisplay(data);
    }
}
