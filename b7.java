
//Bài 7: Viết chương trình giải phương trình bậc 1: ax + b = 0 (a, b nhập từ bàn phím).
//Xét tất cả các trường hợp có thể.

import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: "); double a = sc.nextDouble();
        System.out.println("Nhập b: "); double b = sc.nextDouble();
        double x = -b/a;

        if(a == 0){
            System.out.println("a phải khác 0");

        }else{
            System.out.println("Nghiệm phương trình là: " + x);
        }

    }
}
