import java.util.*;
public class OU1 {
    public static void main(String[] args) {
        System.out.println ("TEMPERATURER\n");
// inmatningsverktyg
        Scanner in = new Scanner (System.in);
        in.useLocale (Locale.US);
// mata in uppgifter om antalet veckor och antalet mätningar
        System.out.print ("antalet veckor: ");
        int antalVeckor = in.nextInt ();
        System.out.print ("antalet mätningar per vecka: ");
        int antalMatningarPerVecka = in.nextInt ();
// plats att lagra temperaturer
        double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];
// mata in temperaturerna
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            System.out.println ("temperaturer - vecka " + vecka + ":");
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                t[vecka][matning] = in.nextDouble ();
        }
        System.out.println ();
// visa temperaturerna
        System.out.println ("temperaturerna:");
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                System.out.print (t[vecka][matning] + " ");
            System.out.println ();
        }
        System.out.println ();
// den minsta, den största och medeltemperaturen – veckovis
        double[] minT = new double[antalVeckor + 1];
        double[] maxT = new double[antalVeckor + 1];
        double[] sumT = new double[antalVeckor + 1];
        double[] medelT = new double[antalVeckor + 1];
// koden ska skrivas här
        int maxValue = 0;
        int minValue = 0;
        int sumValue = 0;
        for(int a = 1; a < t.length; a++)
        {
            sumT[a] = 0;
            //MAX
            maxValue = a;
            for(int b = 0; b < t[a].length; b++)
                if(t[a][maxValue] < t[a][b])
                    maxValue = b;
            maxT[a] = t[a][maxValue];
            System.out.println("Max-temp, Vecka_" + a + ": " + t[a][maxValue]);
            //MIN
            minValue = a;
            for(int b = 1; b < t[a].length; b++)
                if(t[a][minValue] > t[a][b])
                    minValue = b;
            minT[a] = t[a][minValue];
            System.out.println("Min-temp, Vecka_" + a + ": " + t[a][minValue]);
            //SUM
            for(int b = 0; b < t[a].length; b++)
            {
                sumValue += t[a][b];
            }
            sumT[a] = sumValue;
            medelT[a] = sumValue/(t[a].length-1);
            sumValue = 0;

        }
// visa den minsta, den största och medeltemperaturen för varje vecka
// koden ska skrivas här
        System.out.println("Maxtemp/vecka: " + Arrays.toString(maxT));
        System.out.println("Mintemp/vecka: " + Arrays.toString(minT));
        System.out.println("Sumtemp/vecka: " + Arrays.toString(sumT));
        System.out.println("Medeltemp/vecka: " + Arrays.toString(medelT));
// den minsta, den största och medeltemperaturen - hela mätperioden
        double minTemp = minT[1];
        double maxTemp = maxT[0];
        double sumTemp = sumT[0];
        double medelTemp = 0;
// koden ska skrivas här
        int ett = 0;
        int två = 0;
        for(int n = 0; n < maxT.length; n++)
        {
            ett = n;
            for(int m = n + 1; m < maxT.length; m ++ )
                if(maxT[m] > maxT[ett])
                    ett = m;
            två = (int) maxT[n];
            maxT[n] = maxT[ett];
            maxT[ett] = två;
        }

// visa den minsta, den största och medeltemperaturen i hela mätperioden
// koden ska skrivas här
        System.out.println("maxtemp totalt: " + maxTemp);
        System.out.println(Arrays.toString(maxT) + maxTemp);
        System.out.println(minTemp);
    }
}
