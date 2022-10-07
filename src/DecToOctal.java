import java.util.Scanner;

public class DecToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();
        System.out.println(decToOctal(dec));
    }
    public static String decToOctal(int dec) {
        String octal = "";
        while (dec != 0) {
            int remainder = dec % 8;
            dec /= 8;
            octal = remainder + octal;
        }
        return octal;
    }
}
