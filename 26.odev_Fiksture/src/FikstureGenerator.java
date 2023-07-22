import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FikstureGenerator {
    private List<String> teams;

    public FikstureGenerator(List<String> teams){
        this.teams = teams;
    }

    public void generateFixture(){
        if(teams.size() % 2 != 0){
            teams.add("BAY");
        }
        int totalRaund = teams.size()*2 -2;
        int matchPerRaund = teams.size() / 2;
        int num = 1;
        for(int round = 0;round<totalRaund;round++){
            List<String> roundFixture = new ArrayList<>();

            for(int match = 0;match<matchPerRaund;match++){
                String firstTeam = teams.get(match);
                String lastTeam = teams.get(teams.size() - 1-match);

                String figur = firstTeam + " vs " + lastTeam;
                roundFixture.add(figur);
            }
            System.out.println("Round " + num);
            num += 1;
            System.out.println(roundFixture);
            rotateTeams();
        }
    }
    private void rotateTeams() {
        String lastTeam = teams.get(teams.size() - 1);
        teams.remove(teams.size() - 1);
        teams.add(1, lastTeam);
    }

}
