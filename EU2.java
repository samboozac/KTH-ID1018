import java.util.Arrays;
public class DenKortasteVagen {
    public static int[] mellanstationer(double[] ai, double[][] bij, double[]cj)
    {
        double minDist2 = ai[0] + bij[0][0] + cj[0];
        double currentDistance2;
        int [] mStationer = new int[2];
        for (int a = 0; a < ai.length; a++) {
            for (int b = 0; b < bij[a].length; b++) {
                currentDistance2 = ai[a] + bij[a][b] + cj[b];
                System.out.println(currentDistance2);
                System.out.println("ai: " + a + " bij: " + a + ":" + b + " cj: " + b);
                if(minDist2 > currentDistance2) {
                    mStationer[0] = a;
                    mStationer[1] = b;
                }
            }
        }
        return mStationer;
    }
    public static double langd(double[] ai, double[][] bij, double[] cj) {
        double minDist = ai[0] + bij[0][0] + cj[0];
        double currentDistance;
        for (int a = 0; a < ai.length; a++) {
            for (int b = 0; b < bij[a].length; b++) {
                currentDistance = ai[a] + bij[a][b] + cj[b];
                System.out.println(currentDistance);
                System.out.println("ai: " + a + " bij: " + a + ":" + b + " cj: " + b);
                if(minDist > currentDistance)
                    minDist = currentDistance;
            }
        }
        return minDist;
    }
}
