import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] s = new Scanner(System.in).nextLine().split("");
        if (s.length != 6) {
            System.out.println("Incorrect ticket number!");
            return;
        }
        if (Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]) ==
            Integer.parseInt(s[3]) + Integer.parseInt(s[4]) + Integer.parseInt(s[5])) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}