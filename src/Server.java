// I M P O R T S
// C L A S S  D E F I N I T I O N
public class Server
{
    // S T A T I C  C O N S T A N T S
    // A T T R I B U T E S
    private int day;

    // C O N S T R U C T O R S
    public Server()
    {
        this.day = 0;
    }
    // S E T S  A N D  G E T S
    public int getDay(){return this.day;}

    // M E T H O D E S
    public void processDay()
    {
        this.day++;
    }
    // O V E R R I D E S
}
