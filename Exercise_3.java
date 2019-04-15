import java.util.Arrays;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        java.util.Scanner   in = new java.util.Scanner  (System.in);
        in.useLocale(java.util.Locale.US);
        int[][] arrayTest = new int[2] [3];
        for (int tic = 0; tic < arrayTest.length; tic ++)
        {
            for(int tic2 = 0; tic2 < arrayTest[tic].length; tic2 ++)
                arrayTest[tic][tic2] = in.nextInt();
        }
        System.out.println("Our inputed array is: " + Arrays.deepToString(arrayTest));
        int minPos = 0;
        int t = 0;
        for(int q = 0; q < arrayTest.length; q++)
        {
            for(int a = 0; a < arrayTest[q].length; a++)
            {
                minPos = a;
                for(int b = a +1; b < arrayTest[q].length; b++)
                    if(arrayTest[q][b] < arrayTest[q][minPos])
                        minPos = b;
                t = arrayTest[q][a];
                arrayTest[q][a] = arrayTest[q][minPos];
                arrayTest[q][minPos] = t;
            }
        }
        System.out.println(Arrays.deepToString(arrayTest));


    }
}
