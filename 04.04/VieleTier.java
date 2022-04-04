public class VieleTier
{
    private Katze[] vieleKatzen = new Katze[2];
    
    public VieleTier()
    {
        vieleKatzen[0] = new Katze("Robert");
        vieleKatzen[1] = new Katze("Kurgerbing Bamhungers");
        Katze[] alleKatzen = new Katze[100];
        
        for(int i = 0; i < alleKatzen.length;i++)
        {
            alleKatzen[i] = new Katze(Integer.toString(i));
        }
        
        for(int i = 0; i < alleKatzen.length; i++)
        {
            alleKatzen[i].ausgabe();
        }
        
        for(int i = 0; i < vieleKatzen.length; i++)
        {
            vieleKatzen[i].ausgabe();
        }
    }
}
