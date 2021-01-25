import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int temp = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (i != temp / 2 && i != temp / 2 + temp % 2) {
                System.out.print(s.charAt(i));
            }
        }
    }
}