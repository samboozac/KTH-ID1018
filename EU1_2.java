import java.io.*;
// PrintWriter
class PunktTest {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter (System.out, true);
        Polylinje poly = new Polylinje();
        Punkt p1 = new Punkt("A", 0, 2);
        Punkt p2 = new Punkt("B", 0, 4);
        Punkt p3 = new Punkt("C", 0, 6);
        Punkt p4 = new Punkt("D", 0, 8);
        poly.AddVertex(p1);
        poly.AddVertex(p2);
        poly.AddVertex(p3);
        poly.AddVertex(p4);
        out.println(poly.ToString());
        out.println(poly.GetLength());
        String n = p1.GetId();
        double x = p1.GetX();
        double y = p1.GetY();
        out.println(p1.Equals(p2));
        //double d = p1.Distance(p2);
        //boolean b = p1.equals(p2);
        poly.Remove("D");
        out.println(poly.ToString());
        poly.Remove("A");
        out.println(poly.ToString());
        //p2.setX(1);
        //p2.setY(2);

        Punkt p = new Punkt(p1);

    }
}