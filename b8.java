import java.util.Scanner;
import static java.lang.Math.*;

public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, x;

        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.print("Nhập c: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("a phải khác 0");
            System.out.println("Đây không phải phương trình bậc 2");
            return; // Kết thúc chương trình
        }

        double Delta = pow(b, 2) - 4 * a * c;

        if (Delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            x1 = (-b + sqrt(Delta)) / (2 * a);
            x2 = (-b - sqrt(Delta)) / (2 * a);
            System.out.println("Nghiệm thứ nhất: " + x1);
            System.out.println("Nghiệm thứ hai: " + x2);
        } else if (Delta == 0) {
            System.out.println("Phương trình có nghiệm kép: ");
            x = -b / (2 * a);
            System.out.println("Nghiệm kép: " + x);
        } else {
            System.out.println("Phương trình có 2 nghiệm phức");
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrt(-Delta) / (2 * a);
            System.out.println("Nghiệm thứ nhất: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Nghiệm thứ hai: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
