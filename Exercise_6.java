class PlayingWithStrings {
    public static void main(String[] args) {
        System.out.println("Operations with natural numbers as strings");
        java.util.Scanner in = new java.util.Scanner(System.in);
        String number_one = in.nextLine();
        String number_two = in.nextLine();
        System.out.print("Subtraction: ");
        System.out.println(Subtract(number_one, number_two));
        System.out.print("Addition: ");
        System.out.println(Add(number_one, number_two));
    }
    public static String Add(String a, String b) {

        String sum = new String();
        int numeric_one = 0;
        int numeric_two = 0;
        int numeric_carry = 0;
        for (int i = (a.length()-1); i >= 0; i--) {
            numeric_one = Character.getNumericValue(a.charAt(i));
            numeric_two = Character.getNumericValue(b.charAt(i));
            if ((numeric_one + numeric_two + numeric_carry) >= 10) {
                sum = Integer.toString((numeric_one + numeric_two + numeric_carry) % 10) + sum;
                numeric_carry = 1;
            } else {
                sum = Integer.toString((numeric_one + numeric_two + numeric_carry) % 10) + sum;
                numeric_carry = 0;
            }
        }
        if (numeric_carry == 1) {
            sum = "1" + sum;
        }
        return sum;
    }
    public static String Subtract(String a, String b) {
        String sum = new String();
        int numeric_one = 0;
        int numeric_two = 0;
        int numeric_carry = 0;
        for (int i = (a.length()-1); i >= 0; i--) {
            numeric_one = Character.getNumericValue(a.charAt(i));
            numeric_two = Character.getNumericValue(b.charAt(i));
            numeric_one = numeric_one + numeric_carry;
            if (((numeric_one + numeric_carry) - numeric_two) < 0) {
                if (i == 0) {
                    sum = "-" + Integer.toString(Math.abs(numeric_one - numeric_two)) + sum;
                } else {
                    sum = Integer.toString((numeric_one + 10) - numeric_two) + sum;
                    numeric_carry = -1;
                }
            } else {
                sum = Integer.toString(numeric_one -  numeric_two) + sum;
                numeric_carry = 0;
            }
        }
        return sum;
    }
}