import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octal = scanner.next();

        System.out.println(octalStringDecode(octal));
    }
    public static long octalStringDecode(String octal) {
        if (octal.charAt(0) == '0') {
            octal = octal.substring(1);
        }
        long dec = 0;
        for(int i = 0; i < octal.length(); i++) {
            dec += (octal.charAt(i) - 48) * Math.pow(8, (octal.length() - 1) - i);
        }
        return dec;
    }
}
