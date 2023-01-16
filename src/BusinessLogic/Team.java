package BusinessLogic;

import com.google.gson.Gson;

// I M P O R T S
// C L A S S  D E F I N I T I O N
public class Team
{
    // S T A T I C  C O N S T A N T S

    // A T T R I B U T E S
    private int    id;
    private String name;
    private int    strength;

    // C O N S T R U C T O R S
    public Team()
    {
        this.id       = -1;
        this.name     = "unknown";
        this.strength = 90;
    }

    public Team(int id, String name, int strength)
    {
        this.id       = id;
        this.name     = name;
        this.strength = strength;
    }

    // S E T S  A N D  G E T S
    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setStrength(int strength){this.strength = strength;}
    public int getStrength(){return this.strength;}
    public int getId(){return this.id;}

    // M E T H O D E S
    // O V E R R I D E S
    // S T A T I C  M E T H O D E S
}
