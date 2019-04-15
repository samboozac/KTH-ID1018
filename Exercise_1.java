public class UpdateAlgo {
    public static void main(String[] args) {
        int[] vector_one  = {4, 2, -1, 2, -3};
        System.out.println(min(vector_one));
    }
    public static int min (int[] element) throws IllegalArgumentException
    {
        if (element.length == 0)
            throw new IllegalArgumentException ("tom samling");

        int antalPar = element.length / 2;
        int oPar = element.length % 2;
        int minValue = element[0];
        int currentValue;
        int i = 0;
        while(antalPar >= 1)
        {
            while(i <= antalPar) {
                currentValue = element[i] < element[i + 1] ? element[i] : element[i + 1];
                minValue = minValue < currentValue ? minValue : currentValue;
                i += 1;
            }
            antalPar = antalPar/2;
        }
        if (oPar == 1 && (minValue > element[i+1]))
            minValue = element [i+1];
        return minValue;
    }
}
