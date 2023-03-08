public class Arrays2{
    public static void main(String[] args) {
        int Mosaico[][] = new int [2][2];
        Mosaico[0][0] = 25;
        Mosaico[1][0] = 17;
        Mosaico[0][1] = 9;
        Mosaico[1][1] = 13;

        for (int f = 0; f<Mosaico.length; f++){
            for( int c = 0; c<Mosaico.length; c++){
                System.out.print(Mosaico[f][c]+", ");
            }
            System.out.println("");
        }
    }
}