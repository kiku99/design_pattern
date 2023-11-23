package sol3;

public class Client {
    public static void main(String[] args) {
        LineChartDisplay lineChartDisplay = new LineChartDisplay();
        BarChartDisplay barChartDisplay = new BarChartDisplay();
        StockData stockData = new StockData();

        stockData.registerObserver(lineChartDisplay);
        stockData.registerObserver(barChartDisplay);

        stockData.unregisterObserver(lineChartDisplay);

        while (true){
            stockData.dataChanged();
        }
    }
}
