import java.util.Scanner;
//Bài 1: Nhập vào diện tích S của một mặt cầu. Tính thể tích V của hình cầu này.

// S = 4*pi*R^2
// V = 4/3*pi*R^3
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập diện tích mặt cầu");
        double S = sc.nextDouble();

        double R = Math.sqrt( S/(4 * Math.PI));

        double V = (4* Math.PI * Math.pow(R, 3))/3;
        System.out.println("Thể tích của hình cầu là: " + V );
    }
}
