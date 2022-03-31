public class VieleTier
{
    private Katze[] vieleKatzen = new Katze[2];
    
    public VieleTier()
    {
        vieleKatzen[0] = new Katze("Robert");
        vieleKatzen[1] = new Katze("Kurgerbing Bamhungers");
        for(int i = 0; i != vieleKatzen.length;i++)
        {
            vieleKatzen[i].ausgabe();
        }
    }
}
