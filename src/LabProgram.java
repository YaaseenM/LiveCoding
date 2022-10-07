import java.util.InputMismatchException;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int userNum = scanner.nextInt();
            int divNum = scanner.nextInt();
            int result = userNum / divNum;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: " + e.toString());
        }
    }
}
