public class debuggingAlgo {
    public static void main(String[] args) {
        int[] vector_one  = {4, 7, 4, 2, 7, -4, -7, 3, 10, 200, -20, 1, 2, 9, 8, 7, -25, 5, 3};
        System.out.println(min(vector_one));
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
            int[] delsekvens = new int[antaletTankbaraElement];
            int i = 0;
            int j = 0;
            while (antaletPar >= 1)
            {
                i = 0;
                j = 0;
                while (j < antaletPar)
                {
                    delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1];
                    i += 2;
                }
                if (antaletOparadeElement == 1)
                    delsekvens[j] = sekvens[i];
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
