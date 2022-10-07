import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            int temp = i, numOfDigits = 0;
            while (temp != 0) {
                temp/= 10;
                numOfDigits++;
            }
            int num = i;
            int sum = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                sum += Math.pow(lastDigit, numOfDigits);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
