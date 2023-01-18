package Deprecated;
// I M P O R T S
import BusinessLogic.MatchDay;

import java.util.ArrayList;

// C L A S S  D E F I N I T I O N
public class ScheduleStage
{
    // A T T R I B U T E S
    private int                 stage;
    private ArrayList<MatchDay> fixtures;

    // C O N S T R U C T O R S
    public ScheduleStage()
    {
        this.stage    = -1;
        this.fixtures = new ArrayList<MatchDay>();
    }

    public ScheduleStage(int stage, ArrayList<MatchDay> fixtures)
    {
        this.stage    = stage;
        this.fixtures = fixtures;
    }

    // S E T S  A N D  G E T S
    public void setStage(int stage){this.stage = stage;}
    public int getStage(){return this.stage;}
    public ArrayList<MatchDay> getFixtures(){return this.fixtures;}

    // M E T H O D E S
    // O V E R R I D E S
    // I N N E R  C L A S S E S
    public class StageBuilder
    {
        public int stage;
        public MatchDay.MatchDayBuilder[] fixtures;
    }
}
