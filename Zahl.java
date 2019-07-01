public class Zahl extends Feldinhalt
{
    private int inhalt;

    public Zahl()
    {
        inhalt = 1;
    }

    public int inhaltGeben(){
        return inhalt;
    }
    
    public void plus(){
        inhalt ++;
        
    }
}
