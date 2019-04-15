public class Algo {
    public static void main(String[] args) {
        int[] vectorOne = {7, 8, 4, 5, 2, 3, 10, 85, 5, 3, 6, 2, 9, 30, 6, 3, -1, 54, 2};
        System.out.println(min(vectorOne));
    }
    public static int min (int[] element) throws IllegalArgumentException
    {
        if (element.length == 0)
          throw new IllegalArgumentException ("tom samling");

        int antalVarv = 1;
        int[] sekvens = element;
        int antaletPar = sekvens.length / 2;
        int antaletOparadeElement = sekvens.length % 2;
        int antaletTankbaraElement = antaletPar + antaletOparadeElement;

        int i = 0;
        int j = 0;
        while (sekvens.length > 1)
        {
            int[] delsekvens = new int[antaletTankbaraElement];
            i = 0;
            j = 0;
            while (j < antaletPar)
            {
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1];
                i += 2;
            }
            if (antaletOparadeElement == 1)
                delsekvens[j] = sekvens[sekvens.length - 1];
            sekvens = delsekvens;
            antaletPar = antaletTankbaraElement / 2;
            antaletOparadeElement = antaletTankbaraElement % 2;
            antaletTankbaraElement = antaletPar + antaletOparadeElement;
            System.out.println (java.util.Arrays.toString (sekvens));
            if (antalVarv++ == 10)
                System.exit (0);
        }
        return sekvens[0];
    }
}
