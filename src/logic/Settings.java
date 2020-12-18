package logic;

public class Settings {
    private int countOfGame;
    private int countOfPoint;
    private boolean tiebreak;
    private int countOfPointInTiebreaker;

    public void defaultSettings(){};
    public void changeCountOfGame(int change){};
    public void changeCountOfPoint(int change){};
    public void changeTiebreak(boolean change){};
    public void changeCountOfPointInTiebreak(int change){};
    public void save(){};

    public int getCountOfGame(){ return countOfGame;}
    public int getCountOfPoint(){ return countOfPoint;}
    public int getCountOfPointInTiebreaker(){ return countOfPointInTiebreaker;}
    public boolean getTiebreak(){ return tiebreak;}
}
