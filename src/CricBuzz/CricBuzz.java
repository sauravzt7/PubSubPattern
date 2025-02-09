package src.CricBuzz;

public class CricBuzz {

    public int runs;
    public int wickets;
    public int overs;


    private IccApiService iccApiService;

    public CricBuzz(IccApiService iccApiService) {
        this.iccApiService = iccApiService;
    }

    public void updateScores(int runs, int wickets, int overs) {

        while(true){
            iccApiService.updateScore(runs, wickets, overs);

            // write your compare logic if there is a diff we update those attributes

        }
    }
}
