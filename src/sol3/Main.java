package sol3;

public class Main {
    public static void main(String[] args) {
        LineChartDisplay lineChartDisplay = new LineChartDisplay();
        BarChartDisplay barChartDisplay = new BarChartDisplay();
        StockData stockData = new StockData();

        stockData.registerObserver(lineChartDisplay);
        stockData.registerObserver(barChartDisplay);

        stockData.unregisterObserver(lineChartDisplay);

        stockData.dataChanged();
    }
}
