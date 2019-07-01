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
            if(matrix[a][b]==null){
                matrix[a][b] = new Mine();
            } else{ 
                i--;
            }
        }
        zahlenSetzen();
    }

    public void zahlenSetzen(){
        for(int i = 0;i < feld; i++){
            for(int k = 0; k < feld; i++){
                if(matrix[i][k] == mine){
                    if(matrix[i-1][k]==null){
                        matrix[i-1][k] = new Zahl();
                    }
                    if(matrix[i-1][k+1]==null){
                        matrix[i-1][k+1] = new Zahl();
                    }
                    if(matrix[i][k+1]==null){        
                        matrix[i][k+1] = new Zahl();
                    }
                    if(matrix[i+1][k+1]==null){
                        matrix[i+1][k+1] = new Zahl();
                    }
                    if(matrix[i+1][k]==null){
                        matrix[i+1][k] = new Zahl();
                    }
                    if(matrix[i+1][k-1]==null){   
                        matrix[i+1][k-1] = new Zahl();
                    }
                    if(matrix[i][k-1]==null){
                        matrix[i][k-1] = new Zahl();
                    }
                    if(matrix[i-1][k-1]==null){
                        matrix[i-1][k-1] = new Zahl();
                    }
                }
            }
        }
    }
}
