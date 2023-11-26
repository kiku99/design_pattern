package sol2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TAIUpdate TAIUpdate = new TAIUpdate();
        CandleChartUpdate candleChartUpdate = new CandleChartUpdate();
        StockData stockData = new StockData(candleChartUpdate, TAIUpdate);
        Scanner in =  new Scanner(System.in);

        while (true){
            // example of getting data
            String OHLC = in.next();
            stockData.receiveData(OHLC);
        }
    }
}
