
public class Katze extends Tier
{
    public Katze(String _name)
    {
        this.koerpertemperatur = (int)((Math.random() * (500 - 20)) + 20);
        this.name = _name;
        
    }
    
    public Katze()
    {
        this("Joe Mama");
    }
    
    public void ausgabe()
    {
        System.out.println("Körpertemperatur: " + this.koerpertemperatur + "°C");
        System.out.println("Name: " + this.name);
    }
}
