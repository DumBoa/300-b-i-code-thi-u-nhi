import java.util.Scanner;

public class b4 {
    private static final double EPS = 1e-10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (isValidTriangle(a, b, c)) {
            int type = 0;
            if (a == b || b == c || c == a) type += 1;
            if (a == b && b == c) type += 1;
            if (isRightTriangle(a, b, c)) type += 3;

            switch (type) {
                case 0:
                    System.out.println("Tam giác thường");
                    break;
                case 1:
                    System.out.println("Tam giác cân");
                    break;
                case 2:
                    System.out.println("Tam giác đều");
                    break;
                case 3:
                    System.out.println("Tam giác vuông");
                    break;
                case 4:
                    System.out.println("Tam giác vuông cân");
                    break;
            }

            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích S = " + area);
        } else {
            System.out.println("Không hợp lệ");
        }
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    private static boolean isRightTriangle(double a, double b, double c) {
        return Math.abs(a * a + b * b - c * c) < EPS ||
                Math.abs(a * a + c * c - b * b) < EPS ||
                Math.abs(b * b + c * c - a * a) < EPS;
    }
}
