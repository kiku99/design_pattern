package sol2;

import java.util.HashMap;

public class StockData {
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    BarChartDisplay barChartDisplay;
    LineChartDisplay lineChartDisplay;

    public StockData(BarChartDisplay barChartDisplay, LineChartDisplay lineChartDisplay){
        this.barChartDisplay = barChartDisplay;
        this.lineChartDisplay = lineChartDisplay;
    }

    private HashMap getData(){
        return data;
    }

    public void dataChanged(){
        data = getData();
        barChartDisplay.update(data);
        lineChartDisplay.update(data);
    }
}