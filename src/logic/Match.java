package logic;

public class Match {
    public int id;
    public void start(){};
    public void end(){};
    private Set[] games = new Set[]{};
    private Statistic match;
    private MatchType type;
    private Settings settings;
    public Match(){};

    public Set[] getGames(){
        return games;
    }

}
