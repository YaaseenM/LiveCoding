import java.util.Scanner;

public class RemoveGray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int redNum = scanner.nextInt();
        int greenNum = scanner.nextInt();;
        int blueNum = scanner.nextInt();

        int minNum = redNum;

        if (greenNum < minNum) {
            minNum = greenNum;
        }
        else if (blueNum < minNum) {
            minNum = blueNum;
        }

        redNum -=minNum;
        greenNum -= minNum;
        blueNum -= minNum;

        System.out.println(redNum + " " + greenNum + " " + blueNum);

    }
}
