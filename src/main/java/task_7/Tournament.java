package task_7;

import java.util.Arrays;

public class Tournament {

    public void printStandings(Team[] teams){
        Arrays.sort(teams, ((team1, team2) -> team2.points - team1.points));

        for (Team team : teams) {
            System.out.println("Команда: " + team.name + " Очки: " + team.points);
        }
    }

    public Team getBestTeam(Team[] teams){
        if (teams == null || teams.length == 0){
            System.out.println("Список команд порожній!");
        }

        Arrays.sort(teams, ((team1, team2) -> team2.points - team1.points));

        Team theBestTeam = teams[0];
        return theBestTeam;
    }

    public static void main(String[] args){
        Team team = new Team("team", 10, 5, 4, 10);
        Team team2 = new Team("team1", 17, 11, 4, 7);

        Team[] teams = {team, team2};

        Tournament tournament = new Tournament();

        tournament.printStandings(teams);
    }

}
