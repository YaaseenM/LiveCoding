import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] items = new String[size];
        for (int i = 0; i < size; i++) {
            items[i] = scanner.next();
        }
        int currentLength = 0;
        int longestLength = 0;

        for(int i = 0; i < size; i++) {
            if(items[i].equals("I")) {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                }
                currentLength = 0;
            } else {
                currentLength++;
            }
        }
        if (currentLength > longestLength) {
            longestLength = currentLength;
        }
        System.out.println(longestLength);

    }
}
