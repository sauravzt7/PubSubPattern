package src.CricBuzz;

public class IccApiService {
    private int runs;
    private int overs;
    private int wickets;


    public int getRuns() {
        return runs;
    }



    public int getOvers() {
        return overs;
    }

    public int getWickets() {
        return wickets;
    }


    public void updateScore(int runs, int overs, int wickets){

        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
    }
}
