package sol3;

import java.util.HashMap;

public class TAIUpdate implements Observer{
    String data;

    public void update(String data){
        this.data = data;
        display(this.data);
    }

    public void display(String data){
        // do something
        System.out.println("Technical Analysis Indicator");
    }
}
