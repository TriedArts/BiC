package BusinessLogic;
// I M P O R T S
import java.util.ArrayList;

// C L A S S  D E F I N I T I O N
public class Schedule
{
    // S T A T I C  C O N S T A N T S
    // A T T R I B U T E S
    private ArrayList<ArrayList<MatchDay>> fixtureList;
    private int                            currentStage;
    private int                            currentMatchday;

    // C O N S T R U C T O R S
    public Schedule()
    {
        this.currentStage    = 0;
        this.currentMatchday = 0;
        this.fixtureList     = new ArrayList<>();
    }

    // S E T S  A N D  G E T S
    public int getCurrentStage(){return this.currentStage;}

    // M E T H O D E S
    // O V E R R I D E S
    // S T A T I C  M E T H O D E S
}
