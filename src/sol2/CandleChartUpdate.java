package sol2;

import java.util.HashMap;

public class CandleChartUpdate {
    String data;

    public void update(String data){
        this.data = data;
        display();
    }

    public void display(){
        //do something
        System.out.println("Candle Chart");
    }
}
