package sol1;


public class CricketData {
    int runs, wickets;
    float overs;


    private int getLatestRuns(){
        return 90;
    }

    private int getLatestWickets(){
        return 2;
    }

    private float getLatestOvers(){
        return (float) 10.2;
    }

    public void currentScoreDisplay(int runs, int wickets, float overs){
        System.out.println("\nCurrent Score Display: \n" + "Runs: " + runs + "\nWickets:" + wickets + "\nOvers: " + overs);
    }

    public void averageScoreDisplay(int runs, float overs){
        System.out.println("\nAverage Score Display:\n" + "Run Rate: " + runs/overs + "\nPredictedScore: " + (runs/overs)*50);
    }

    public void dataChanged(){
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay(runs, wickets, overs);
        averageScoreDisplay(runs, overs);
    }
}
