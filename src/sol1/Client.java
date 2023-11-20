package sol1;
public class Client {
    public static void main(String[] args) {

        StockData stockData = new StockData();

        while (true){
            stockData.dataChanged();
        }
    }
}
