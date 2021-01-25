import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sub = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < s.length() - sub.length() + 1; i++) {
            if (s.startsWith(sub, i)) {
                i += sub.length() - 1;
                ++result;
            }
        }
        System.out.println(result);
    }
}