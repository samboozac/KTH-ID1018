import java.util.*;
public class BestamDenKortasteVagen {
    public static void main(String[] args) {
        double[] ai = new double[3];
        double[][] bij = new double[3][4];
        double[]cj = new double[4];

        for(int i = 0; i < 3; i++)
        {
            ai[i] = Math.random() * 10;
            for(int o = 0; o < 4; o++)
            {
                bij[i][o] = Math.random() * 10;
                cj[o] = Math.random() * 10;
            }
        }
        System.out.println("From X to U: " + Arrays.toString(ai));
        System.out.println("From U to V: " + Arrays.deepToString(bij));
        System.out.println("From V to Y: " + Arrays.toString(cj));
        System.out.println("Minimum distance is: " + DenKortasteVagen.langd(ai, bij, cj));
        System.out.println("Stops: " + Arrays.toString(DenKortasteVagen.mellanstationer(ai, bij, cj)));


    }
}
