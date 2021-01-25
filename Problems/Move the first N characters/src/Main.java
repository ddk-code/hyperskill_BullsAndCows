import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int n = Integer.parseInt(s.split(" ")[1]);
        s = s.split(" ")[0];
        if (n > s.length()) {
            System.out.println(s);
            return;
        }
        System.out.print(s.substring(n));
        System.out.println(s.substring(0, n));
    }
}