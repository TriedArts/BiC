package BusinessLogic;
// I M P O R T S
import translucentpen.com.misc.Log;

// C L A S S  D E F I N I T I O N
public class Match
{
    // S T A T I C  C O N S T A N T S
    // A T T R I B U T E S
    private Team homeTeam;
    private Team awayTeam;
    private int  homeGoals;
    private int  awayGoals;
    private int  minute;

    // C O N S T R U C T O R S
    public Match(Team home, Team away)
    {
        this.homeTeam  = home;
        this.awayTeam  = away;
        this.homeGoals = 0;
        this.awayGoals = 0;
        this.minute    = 0;
    }

    // S E T S  A N D  G E T S
    public int getHomeGoals(){return this.homeGoals;}
    public int getAwayGoals(){return this.awayGoals;}
    public int getMinute(){return this.minute;}

    // M E T H O D E S
    public void processMinute()
    {
        Log.log("Match.processMinute;ProcessMinute is not implemented yet");
        return;
    }

    // O V E R R I D E S
    // S T A T I C  M E T H O D E S
}
