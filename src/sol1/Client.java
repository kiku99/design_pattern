package sol1;

import java.util.HashMap;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        Scanner in = new Scanner(System.in);

        while (true){
            // example of getting data
            String OHLC = in.next();
            stockData.receiveData(OHLC);
        }
    }
}
