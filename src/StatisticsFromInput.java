import java.util.Scanner;

public class StatisticsFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int maxValue = 0, sum = 0, count = 0;
        while (value >= 0) {
            if (value > maxValue) {
                maxValue = value;
            }
            sum += value;
            count++;
            value = scanner.nextInt();
        }
        int average = sum / count;
        System.out.println(maxValue + " " + average);
    }
}
