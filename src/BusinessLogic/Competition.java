package BusinessLogic;
// I M P O R T S
import java.util.ArrayList;

// C L A S S  D E F I N I T I O N
public class Competition
{
    // S T A T I C  C O N S T A N T S
    // A T T R I B U T E S
    private int             id;
    private String          name;
    private ArrayList<Team> participants;

    // C O N S T R U C T O R S
    public Competition()
    {
        this.id           = -1;
        this.name         = "unknown";
        this.participants = new ArrayList<Team>();
    }

    // S E T S  A N D  G E T S
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    // M E T H O D E S
    // O V E R R I D E S
    // S T A T I C  M E T H O D E S
}
