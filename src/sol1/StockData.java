package sol1;

public class StockData {

    public void CandleChartUpdate(String data){
        //do something
        System.out.println("Candle Chart");
    }

    public void TAIUpdate(String data){
        //do something
        System.out.println("Technical Analysis Indicator");
    }

    public void receiveData(String data){
        CandleChartUpdate(data);
        TAIUpdate(data);
    }
}
