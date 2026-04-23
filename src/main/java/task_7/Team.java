package task_7;

public class Team {
    String name;
    int wins;
    int losses;
    int draws;
    int points;

    public Team(String name, int wins, int losses, int draws, int points) {
        setName(name);
        setWins(wins);
        setLosses(losses);
        setDraws(draws);
        setPoints(points);
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        if (draws >= 0){
            this.draws = draws;
        }
    }


    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        if (losses >= 0){
            this.losses = losses;
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        if (wins >= 0){
            this.wins = wins;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2){
            this.name = name;
        }

    }

    public void recordWin(){
        this.wins++;
        this.points += wins * 3;
    }

    public void recordLose(){
        this.losses++;
    }

    public void recordDraw(){
        this.draws++;
        this.points += draws;
    }

    public void setPoints(int points) {
        if (points >= 0) {
            this.points = points;
        }
    }

    public int getPoints(){
        return points;
    }
}
