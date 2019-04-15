import java.util.*;
public class Distance {
    public static void main(String[] args) {
        double[] ai = new double[3];
        double[][] bij = new double[3][4];
        double[]cj = new double[4];
        double[] dist = new double[12];
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
       int c = 0;
        for(int a = 0; a < ai.length; a++)
        {
            for(int b = 0; b < bij[a].length; b++)
            {
                dist[c] = ai[a] + bij[a][b] + cj[b];
                System.out.println("ai: " + a + " bij: " + a + ":" + b + " cj: " + b);
                c++;
            }
        }
        System.out.println(Arrays.toString(dist));
        double minDist = dist[0];
        int position = 0;
        for(int p = 1; p < dist.length; p++)
        {
            if(minDist > dist[p])
            {
                minDist = dist[p];
                position = p;
            }
        }
        System.out.println(minDist + " " + position);
    }
}
