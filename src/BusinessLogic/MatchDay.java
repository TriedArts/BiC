package BusinessLogic;
// I M P O R T S
import java.util.ArrayList;

// C L A S S  D E F I N I T I O N
public class MatchDay
{
    // S T A T I C  C O N S T A N T S
    // A T T R I B U T E S
    private ArrayList<Match> matches;

    // C O N S T R U C T O R S
    public MatchDay()
    {
        this.matches = new ArrayList<Match>();
    }

    // S E T S  A N D  G E T S
    public ArrayList<Match> getMatches(){return this.matches;}

    // M E T H O D E S
    // O V E R R I D E S
    // S T A T I C  M E T H O D E S

    // I N N E R  C L A S S
    public class MatchDayBuilder
    {
        public Match.MatchBuilder[] matches;
    }
}
