import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:");
        int userInt = scanner.nextInt();
        System.out.println("Enter double:");
        double userDouble = scanner.nextDouble();
        System.out.println("Enter character:");
        char userChar = scanner.next().charAt(0);
        System.out.println("Enter string:");
        String userString = scanner.next();

        System.out.println(userInt + " " + userDouble + " " + userChar+ " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        int userDoubleToInt = (int) userDouble;
        System.out.println(userDouble + " cast to an integer is " + userDoubleToInt);
    }
}
