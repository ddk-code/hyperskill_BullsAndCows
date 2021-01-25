import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int count;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            count = 0;
            while (i < s.length() && s.charAt(i) == temp) {
                ++count;
                ++i;
            }
            System.out.print(temp + "" + count);
            --i;
        }
    }
}