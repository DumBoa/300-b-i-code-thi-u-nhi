//Bài 15: Viết chương trình nhập vào ngày, tháng, năm (giả sử nhập đúng, không cần
//kiểm tra hợp lệ). Tìm xem ngày đó là ngày thứ bao nhiêu trong năm.
//Nếu không dùng vòng lặp, có thể dùng công thức sau:
//        sum = (int) (30.42 * (month - 1)) + day
//        Nếu month = 2, hoặc năm nhuận và month > 2 thì sum = sum + 1
//        Nếu 2 < month < 8 thì sum = sum - 1

import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        int d, m, y;
        double sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Ngày: ");
        d = sc.nextInt();
        System.out.println("Nhập Tháng: ");
        m = sc.nextInt();
        System.out.println("Nhập Năm: ");
        y = sc.nextInt();
        sum = (int) (30.42 * (m - 1)) + d;
        if(m == 2 || namNhuan(y) && m > 2){
          sum = sum + 1;
        }
        if(m > 2 && m < 8){
            sum = sum - 1;
        }
        System.out.println("Ngay thu: " + sum);
    }

    public static boolean namNhuan(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

}

