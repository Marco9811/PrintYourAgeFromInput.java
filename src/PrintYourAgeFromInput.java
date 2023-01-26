import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set Your Age:");
        int age = scanner.nextInt();
        System.out.printf("my age is %s",age);
    }
}
