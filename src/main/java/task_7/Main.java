package task_7;

public class Main {
    public static void main(String[] args){
        Team team1 = new Team("team1", 10, 5, 4, 10);
        Team team2 = new Team("team2", 17, 11, 4, 7);
        Team team3 = new Team("team3", 4, 5, 9, 6);
        Team team4 = new Team("team4", 2, 5, 9, 8);

        Team[] teams = {team1, team2, team3, team4};

        Match match = new Match();
        Tournament tournament = new Tournament();

        match.playMatch(team1, team2, 3, 0);
        match.playMatch(team3, team4, 2, 1);

        tournament.printStandings(teams);
        tournament.getBestTeam(teams);
    }
}
