public class HanteraTal {
    public static void main(String[] args) {
        System.out.println ("HANTERA TAL");
        System.out.println ();
        java.util.Scanner    in = new java.util.Scanner (System.in);
        in.useLocale (java.util.Locale.US);

        double[]    tal = new double[10];
        System.out.println ("ange precis 10 tal:");
        for (int pos = 0; pos < tal.length; pos++)
            tal[pos] = in.nextDouble ();
        double    sum = 0;
        for (int pos = 0; pos < tal.length; pos++)
            sum = sum + tal[pos];  // sum += tal[pos];
        double    medelVarde = sum / tal.length;

        double    min = tal[0];
        for (int pos = 1; pos < tal.length; pos++)
            if (tal[pos] < min)
                min = tal[pos];
        System.out.println ("\ntalens summa: " + sum);
        System.out.println ("talens medelvarde: " + medelVarde);
        System.out.println ("det minsta av talen: " + min);
        int    minPos = 0;
        double    t = 0;
        for (int pos = 0; pos < tal.length - 1; pos++)
        {
            minPos = pos;
            for (int p = pos + 1; p < tal.length; p++)
                if (tal[p] < tal[minPos])
                    minPos = p;
            t = tal[pos];
            tal[pos] = tal[minPos];
            tal[minPos] = t;
        }
        System.out.println ("\ntalen i stigande ordning:");
        for (double q : tal)
            System.out.print (q + "  ");
        System.out.println ();
    }
}
