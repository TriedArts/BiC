package BusinessLogic;
// I M P O R T S
import com.google.gson.Gson;
import translucentpen.com.misc.Log;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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

    // S T A T I C  I N N E R  C L A S S
    public class ScheduleBuilder
    {
        // A T T R I B U T E S
        private MatchDay[][] fixtureList;

        // C O N S T R U C T O R S
        public ScheduleBuilder(){this.fixtureList = null;}

        // S E T S  A N D  G E T S
        public void setFixtures(MatchDay[][] fixtures){this.fixtureList = fixtures;}

        // M E T H O D E S
        private static ScheduleBuilder loadScheduleBuilder(String scheduleJsonFile)
        {
            try
            {
                File file = new File(scheduleJsonFile);
                String scheduleJson = "";
                Scanner sc = new Scanner(file);
                if(sc.hasNextLine())
                    scheduleJson = sc.nextLine();
                return (new Gson()).fromJson(scheduleJson,ScheduleBuilder.class);
            }
            catch(FileNotFoundException fnfEx)
            {
                Log.log("Schedule.ScheduleBuilder.loadScheduleBuilder1;" + fnfEx.getLocalizedMessage());
            }
            return null;
        }

        // S T A T I C  M E T H O D E S
        public static Schedule buildSchedule(String scheduleJsonFile)
        {
            ScheduleBuilder sb = loadScheduleBuilder(scheduleJsonFile);
            System.out.println(sb.fixtureList[0].length);
            return null;
        }
    }
}
