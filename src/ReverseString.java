import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input, result;

        input = scnr.nextLine();
        result = reverseString( input);
        System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
    }

    public static String reverseString(String s) {
        if(s.length() == 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
}
