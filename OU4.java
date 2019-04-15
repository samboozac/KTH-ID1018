import java.util.Scanner;
import static java.lang.System.out;
public class OperationsWithNaturalsOU4 {
    public static void main(String[] args) {
        out.println("Operations with natural numbers given as strings\n");
        Scanner in = new Scanner(System.in);
        out.println("Enter two natural numbers: ");
        String tal1 = in.next();
        String tal2 = in.next();
        String sum_1 = addition(tal1, tal2);
        String diff_1 = difference(tal1, tal2);
        visa(tal1, tal2, diff_1, '-');
        visa(tal1, tal2, sum_1, '+');
    }
    public static String addition(String a, String b) {
        int digit_1 = 0;
        int digit_2 = 0;
        int new_digit;
        int carry = 0;
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        StringBuilder sum = new StringBuilder();

        while (p1 >= 0 && p2 >= 0) {
            digit_1 = Character.getNumericValue(a.charAt(p1));
            digit_2 = Character.getNumericValue(b.charAt(p2));
            if((digit_1 + digit_2 + carry) >= 10) {
                new_digit = (digit_1 + digit_2 + carry) % 10;
                carry = 1;
            } else {
                new_digit = digit_1 + digit_2 + carry;
                carry = 0;
            }
            sum.insert(0, new_digit);
            p1--;
            p2--;
        }
        while (p1 >= 0) {
            if((digit_1 + carry) >= 10) {
                digit_1 = (Character.getNumericValue(a.charAt(p1)) + carry)% 10;
                carry = 1;
            } else {
                digit_1 = Character.getNumericValue(a.charAt(p1)) + carry;
                carry = 0;
            }
            sum.insert(0, digit_1);
            p1--;
        }
        while (p2 >= 0) {
            if((digit_2 + carry) >= 10) {
                digit_2 = (Character.getNumericValue(a.charAt(p2)) + carry) % 10;
                carry = 1;
            } else {
                digit_2 = Character.getNumericValue(a.charAt(p2)) + carry;
                carry = 0;
            }
            sum.insert(0, digit_2);
            p2--;
        }
        if (carry == 1)
            sum.insert(0, 1);
        return sum.toString();
    }
    public static String difference(String a, String b) {
        int digit_1 = 0;
        int digit_2 = 0;
        int new_digit;
        int carry = 0;
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        StringBuilder sum = new StringBuilder();

        while (p1 >= 0 && p2 >= 0) {
            digit_1 = Character.getNumericValue(a.charAt(p1));
            digit_2 = Character.getNumericValue(b.charAt(p2));
            if((digit_1 - digit_2 - carry) < 0) {
                new_digit = (digit_1 - digit_2 - carry) + 10;
                carry = 1;
            } else {
                new_digit = digit_1 - digit_2 - carry;
                carry = 0;
            }
            sum.insert(0, new_digit);
            p1--;
            p2--;
        }
        while (p1 >= 0) {
            if((digit_1 - carry) < 0) {
                digit_1 = (Character.getNumericValue(a.charAt(p1)) - carry) + 10;
                carry = 1;
            } else {
                digit_1 = Character.getNumericValue(a.charAt(p1)) - carry;
                carry = 0;
            }
            sum.insert(0, digit_1);
            p1--;
        }
        while (p2 >= 0) {
            if((digit_2 - carry) < 0) {
                digit_2 = (Character.getNumericValue(a.charAt(p2)) - carry) + 10;
                carry = 1;
            } else {
                digit_2 = Character.getNumericValue(a.charAt(p2)) - carry;
                carry = 0;
            }
            sum.insert(0, digit_2);
            p2--;
        }
        return sum.toString();
    }

    public static void visa(String tal1, String tal2, String resultat, char operator) {
        // sätt en lämplig längd på heltalen och resultatet
        int len1 = tal1.length();
        int len2 = tal2.length();
        int len = resultat.length();
        int maxLen = Math.max(Math.max(len1, len2), len);
        tal1 = sattLen(tal1, maxLen - len1);
        tal2 = sattLen(tal2, maxLen - len2);
        resultat = sattLen(resultat, maxLen - len);
        // visa heltalen och resultatet
        out.println(" " + tal1);
        out.println("" + operator + " " + tal2);
        for (int i = 0; i < maxLen + 2; i++)
            out.print("-");
        out.println();
        out.println(" " + resultat + "\n");
    }

    public static String sattLen(String s, int antal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < antal; i++)
            sb.insert(0, " ");
        return sb.toString();
    }
}

