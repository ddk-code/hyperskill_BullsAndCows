import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        if (!s.contains("?")) {
            System.err.println("Wrong input!");
            return;
        }
        s = s.split("\\?")[1];

        String pass = null;
        String[] arr = s.split("&");
        for (String value : arr) {
            print(value);
            if (value.contains("pass")) {
                String[] temp = value.split("=");
                if (temp.length < 2) {
                    System.err.println("Wrong password!");
                    return;
                }
                pass = temp[1];
            }
        }
        if (pass != null) {
            System.out.println("password : " + pass);
        }
    }

    public static void print(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) != '=') {
            System.out.print(s.charAt(i++));
        }
        System.out.print(" : ");
        if (i == s.length() - 1) {
            System.out.println("not found");
        } else {
            ++i;
            while (i < s.length()) {
                System.out.print(s.charAt(i++));
            }
            System.out.println();
        }
    }
}