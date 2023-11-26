package sol3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TAIUpdate TAIUpdate = new TAIUpdate();
        CandleChartUpdate candleChartUpdate = new CandleChartUpdate();
        Observable stockData = new Observable();
        Scanner in = new Scanner(System.in);

        stockData.registerObserver(TAIUpdate);
        stockData.registerObserver(candleChartUpdate);

        stockData.unregisterObserver(TAIUpdate);

        while (true){
            // example of getting data
            String OHLC = in.next();
            stockData.receiveData(OHLC);
        }
    }
}
