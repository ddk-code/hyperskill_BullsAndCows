import java.util.*;

public class Main {
    public static void main(String[] args) {
        String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String low = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        Scanner scanner = new Scanner(System.in);
        int upAmount = scanner.nextInt();
        int lowAmount = scanner.nextInt();
        int digitsAmount = scanner.nextInt();
        int n = scanner.nextInt();

        for (int j = 0; j < upAmount; j++) {
            System.out.print(up.charAt(j % 26));
        }
        for (int j = 0; j < lowAmount; j++) {
            System.out.print(low.charAt(j % 26));
        }
        for (int j = 0; j < digitsAmount; j++) {
            System.out.print(digits.charAt(j % 10));
        }
        n = n - upAmount - lowAmount - digitsAmount;
        for (int i = 0; i < n; i++) {
            System.out.print(up.charAt(Math.abs(25 - i % 26)));
            if (++i < n) {
                System.out.print(low.charAt(i % 26));
            }
            if (++i < n) {
                System.out.print(digits.charAt(i % 10));
            }
        }
    }
}