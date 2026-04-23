package task_7;

public class Match {
    public void playMatch(Team team1, Team team2, int score1, int score2) {
        if (team1 != null && team2 != null) {
            return;
        }
        if (score1 > score2) {
            team1.recordWin();
            team2.recordLose();
        } else if (score1 < score2) {
            team2.recordWin();
            team1.recordLose();
        } else {
            team1.recordDraw();
            team2.recordDraw();
        }
    }

    public String getResult(int score1, int score2){
        if (score1 >= 0 && score2 >= 0) {

            if (score1 > score2) {
                return "Перемога!";
            } else if (score1 < score2) {
                return "Поразка!";
            } else {
                return "Нічия!";
            }
        } else {
            throw new IllegalArgumentException("Помилка! Рахунок не може бути меншим 0!");
        }
    }
}


