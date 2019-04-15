public class CreateTxt {
    public static void main(String[] args)
        throws Exception
    {
        System.out.println("CV-Template");
        System.out.println();
        java.util.Scanner   in = new java.util.Scanner (System.in);

        System.out.print("Name (Surname - Familname): " );
        String name = in.nextLine();

        System.out.println();
        System.out.print("Birth (yyyy-mm-dd): ");
        int birth = in.nextInt();
        in.nextLine();

        System.out.print("First Job: ");
        String job = in.nextLine();
        System.out.println();

        System.out.print("Second Job: ");
        String job2 = in.nextLine();
        System.out.println();

        System.out.print("Third Job: ");
        String job3 = in.nextLine();
        System.out.println();

        System.out.print("Fourth Job: ");
        String job4 = in.nextLine();
        System.out.println();

        System.out.print("Fifth Job: ");
        String job5 = in.nextLine();

        java.io.PrintWriter fout = new java.io.PrintWriter("CvTemplate.txt");
        fout.println(name + " : " + birth);
        fout.println("Jobs: " + job + " " + job2 + " " + job3 + " " + job4 + " " + job5);
        fout.flush();
    }
}
