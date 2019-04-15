public class ValjPolylinje {
        private static final java.util.Random rand = new java.util.Random();
        private static final int POLYLINE_COUNT = 10;
        private static final String[] colours = {"Blue", "Red", "Yellow"};

        public static void main (String[] args) {
            // A new Object vector with 10 slots.
            Polylinje[] polylines = new Polylinje[POLYLINE_COUNT];
            // Adds a new polyline by calling the method 'randomPolyline' on every index
            for (int i = 0; i < POLYLINE_COUNT; i++) {
                polylines[i] = randomPolyline();
            }
            double short_poly = 1000;
            int short_index = -1;
            for (int i = 0; i < polylines.length; i++) {
                if (polylines[i].getColour() == "Yellow" &&
                        polylines[i].getLength() < short_poly) {
                    short_index = i;
                    short_poly = polylines[i].getLength();
                }
            }
            if (short_poly != 1000) {
                System.out.println(short_poly);
                System.out.println(polylines[short_index].ToString());
            }
        }

        public static Punkt randomPoint() {
            String n = "" + (char) (65 + rand.nextInt(26));
            int x = rand.nextInt(11);
            int y = rand.nextInt(11);

            return new Punkt(n, x, y);
        }

        public static Polylinje randomPolyline() {
            Polylinje polyline = new Polylinje();
            int vertex_count = 2 + rand.nextInt(7);
            int vertex_selected_count = 0;
            boolean[] selected_ids = new boolean[26];
            Punkt selected_point = null;
            char selected_char = 0;
            while (vertex_selected_count < vertex_count) {
                selected_point = randomPoint();
                while ((selected_ids[(int)(selected_point.GetId().charAt(0)) % 65])) {
                    selected_point.SetId("" + (char)(65 + rand.nextInt(26)));
                }
                polyline.AddVertex(selected_point);
                selected_ids[(int)(selected_point.GetId().charAt(0)) % 65] = true;
                vertex_selected_count++;
            }
            polyline.SetColour(colours[rand.nextInt(3)]);
            return polyline;
        }
}
