
//Bài 6: Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình theo
//thứ tự tăng dần và chỉ dùng tối đa một biến phụ.

import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: "); int a = sc.nextInt();
        System.out.print("Nhập b: "); int b = sc.nextInt();
        System.out.println("Nhập c: "); int c = sc.nextInt();
        int temp;
        if( a > b ){
            temp = a;a = b;b = temp;
        }
        if(a > c ){
            temp = a;a = c;c = temp;
        }
        if(b > c){temp = b;b = c;c = temp;
        }
        System.out.println("Thứ tự đã sắp xếp: " + a + b + c);
    }
}
