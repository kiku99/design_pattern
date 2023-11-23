package sol2;

public class Client {
    public static void main(String[] args) {
        LineChartDisplay lineChartDisplay = new LineChartDisplay();
        BarChartDisplay barChartDisplay = new BarChartDisplay();
        StockData stockData = new StockData(barChartDisplay, lineChartDisplay);

        while (true){
            stockData.dataChanged();
        }
    }
}
