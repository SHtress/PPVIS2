package logic;

public class Score {
    private int[] firstTeamScore;
    private int[] secondTeamScore;

    public static void addPoint(int point){};
    public static void subPoint(int point){};

    public int[] getFirstTeamScore(){
        return firstTeamScore;
    }
    public int[] getSecondTeamScore(){
        return secondTeamScore;
    }
}
