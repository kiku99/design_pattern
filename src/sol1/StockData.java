package sol1;
import java.util.HashMap;

public class StockData {

    HashMap<String, Integer> data = new HashMap<String, Integer>();

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
