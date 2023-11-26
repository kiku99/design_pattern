package sol3;

public class CandleChartUpdate implements Observer{
    String data;

    public void update(String data){
        this.data = data;
        display(this.data);
    }

    public void display(String data){
        // do something
        System.out.println("Candle Chart");
    }
}
