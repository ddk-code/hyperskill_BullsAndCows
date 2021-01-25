import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine().toLowerCase();
        int g = 0;
        int c = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'g') {
                ++g;
            }
            if (line.charAt(i) == 'c') {
                ++c;
            }
        }
        System.out.println((double) (g + c) / line.length() * 100);
    }
}