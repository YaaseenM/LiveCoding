import java.util.Scanner;

public class Acronyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String res = createAcronym(input);
        System.out.println(res);
    }

    public static String createAcronym(String userPhrase) {
        String acronym = "";
        for (int i = 0; i < userPhrase.length(); i ++) {
            if (i == 0) {
                if (userPhrase.charAt(i) >= 65 && userPhrase.charAt(i) <= 90) {
                    acronym += userPhrase.charAt(i);
                }
            }
            if (userPhrase.charAt(i) == ' ' && i != userPhrase.charAt(i) - 1) {
                if (Character.isUpperCase(userPhrase.charAt(i+1))) {
                    acronym += userPhrase.charAt(i + 1);
                }
            }
        }
        return acronym;
    }
}
