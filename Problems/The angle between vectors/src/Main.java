import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ux = scanner.nextInt();
        int uy = scanner.nextInt();
        int vx = scanner.nextInt();
        int vy = scanner.nextInt();
        System.out.println(Math.toDegrees(Math.acos((ux * vx + vy * uy) / (Math.hypot(ux, uy) * Math.hypot(vx, vy)))));
    }
}