import java.util.Scanner;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.next();
        while (!name.equals("-1")) {
            String ageStr = scanner.next();
            int age;
            try {
                age = Integer.parseInt(ageStr);
                System.out.println(name + " " + (age +1 ));
            }
            catch (Exception e) {
                age = 0;
                scanner.nextLine();
                System.out.println(name + " " + age);
            }
            name = scanner.next();
        }
    }
}
