public class Arrays3{
    public static void main(String[] args) {
        int Mosaico[][] = new int [2][3];
        Mosaico[0][0] = 25;
        Mosaico[0][1] = 17;
        Mosaico[0][2] = 27;
        Mosaico[1][0] = 9;
        Mosaico[1][1] = 13;
        Mosaico[1][2] = 94;

        for (int f = 0; f<Mosaico.length; f++){
            for( int c = 0; c<Mosaico[0].length; c++){
                System.out.print(Mosaico[f][c]+", ");
            }
            System.out.println("");
        }
    }
} 
