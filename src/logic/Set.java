package logic;

public class Set {
    private long timer;
    private int numberOfGame;
    private int firstTeamBreaks;
    private int secondTeamBreaks;
    private boolean isTieBreak;
    private Team firstTeam;
    private Team secondTeam;
    private Score score = new Score();

    public void addPoint(int point){};
    public void subPoint(int point){};
    public Team checkServe(){
        Team team = new Team();
        return team;
    };
    public void startTimeOut(int a,long b){};
    public boolean runTimer(){ return true;};
    public boolean stopTimer(){return false;};

    public int getNumberOfGame(){return numberOfGame;}
    public Score getScore(){return score;}
    public boolean getIsTieBreak(){
        return isTieBreak;
    }

}
