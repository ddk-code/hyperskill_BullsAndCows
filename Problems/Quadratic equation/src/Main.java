import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(r1 > r2 ? r2 + " " + r1 : r1 + " " + r2);
    }
}