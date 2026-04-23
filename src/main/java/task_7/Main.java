package task_7;

public class Main {
    public static void main(String[] args){
        // Створюємо команди - клас Team
        Team team1 = new Team("team1", 10, 5, 4, 10);
        Team team2 = new Team("team2", 17, 11, 4, 7);
        Team team3 = new Team("team3", 4, 5, 9, 6);
        Team team4 = new Team("team4", 2, 5, 9, 8);

        Team[] teams = {team1, team2, team3, team4};

        // Створюємо новий об'єкт match - клас Match
        Match match = new Match();

        // Створюємо новий об'єкт tournament - клас Tournament
        Tournament tournament = new Tournament();

        // Граємо матчі - метод playMatch - клас Match
        match.playMatch(team1, team2, 3, 0);
        match.playMatch(team3, team4, 2, 1);

        // Виводимо таблицю та топову команду - клас Tournament (методи printStandings та getBestTeam)
        tournament.printStandings(teams);
        tournament.getBestTeam(teams);
    }
}
