import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String[] arr = s.split("-");
        if (arr.length != 3) {
            System.err.println("Wrong input!");
            return;
        }
        System.out.println(arr[1] + "/" + arr[2] + "/" + arr[0]);
    }
}