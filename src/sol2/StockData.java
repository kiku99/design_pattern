package sol2;

public class StockData {
    CandleChartUpdate candleChartUpdate;
    TAIUpdate TAIUpdate;

    public StockData(CandleChartUpdate candleChartUpdate, TAIUpdate TAIUpdate){
        this.candleChartUpdate = candleChartUpdate;
        this.TAIUpdate = TAIUpdate;
    }

    public void receiveData(String data){
        candleChartUpdate.update(data);
        TAIUpdate.update(data);
    }
}
