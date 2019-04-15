import java.util.Scanner;
import static java.lang.System.out;

public class OperationerMedNaturligaHeltalGivnaSockTeckenstrangar {
    public static void main (String[] args)
    {
        out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
        Scanner in = new Scanner (System.in);
        out.println ("två naturliga heltal:");
        String tal1 = in.next ();
        String tal2 = in.next ();
        out.println ();
        String summa = addera (tal1, tal2);
        visa (tal1, tal2, summa, '+');
    }
    public static String addera (String tal1, String tal2)
    {
        int addNumbers = Integer.parseInt(tal1 + tal2);
        return addNumbers;
    }
    public static void visa (String tal1, String tal2, String resultat, char operator)
    {
        int len1 = tal1.length ();
        int len2 = tal2.length ();
        int len = resultat.length ();
        int maxLen = Math.max (Math.max (len1, len2), len);
        tal1 = sattLen (tal1, maxLen - len1);
        tal2 = sattLen (tal2, maxLen - len2);
        resultat = sattLen (resultat, maxLen - len);
        out.println (" " + tal1);
        out.println ("" + operator + " " + tal2);
        for (int i = 0; i < maxLen + 2; i++)
            out.print ("-");
        out.println ();
        out.println (" " + resultat + "\n");
    }
    public static String sattLen (String s, int antal)
    {
        StringBuilder sb = new StringBuilder (s);
        for (int i = 0; i < antal; i++)
            sb.insert (0, " ");
        return sb.toString ();
    }
}

}
