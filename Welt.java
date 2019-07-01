public class Welt
{
    Feldinhalt [][] matrix;
    int feld;
    Mine mine;
    
    public Welt(int Feldgrösse,int AnzahlMinen)
    {
         feld = Feldgrösse;
         matrix = new Feldinhalt[Feldgrösse][Feldgrösse];
         mienenSetzen(AnzahlMinen);
    }
    
    public void mienenSetzen(int AnzahlMinen){
        for(int i = 0;i < AnzahlMinen;i++){
            int a = (int) Math.random() * feld;
            int b = (int) Math.random() * feld;
            matrix[a][b] = new Mine();
        }        
        zahlenSetzen();
    }
    
    public void zahlenSetzen(){
        for(int i = 0;i < feld; i++){
            for(int k = 0; k < feld; i++){
                if(matrix[i][k] == mine){
                    if(matrix[i][k]==null){
                    matrix[i-1][k] = new Zahl();
                    matrix[i-1][k+1] = new Zahl();
                    matrix[i][k+1] = new Zahl();
                    matrix[i+1][k+1] = new Zahl();
                    matrix[i+1][k] = new Zahl();
                    matrix[i+1][k-1] = new Zahl();
                    matrix[i][k-1] = new Zahl();
                    matrix[i-1][k-1] = new Zahl();
                }
                }
            }
        }
    }
}
