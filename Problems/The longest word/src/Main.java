import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] arr = new Scanner(System.in).nextLine().split(" ");

        int maxLength = findMaxLength(arr);
        for (String s : arr) {
            if (s.length() == maxLength) {
                System.out.println(s);
                return;
            }
        }
    }

    public static int findMaxLength(String[] arr) {
        int maxLength = arr[0].length();
        for (String s : arr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }
}