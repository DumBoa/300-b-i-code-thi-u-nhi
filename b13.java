//Bài 13: Viết chương trình nhập vào ngày, tháng, năm. Kiểm tra ngày và tháng nhập
//có hợp lệ hay không. Tính thứ trong tuần của ngày đó.
//        Năm nhuận (leap year) tính theo lịch Gregorian (từ 1582): năm phải chia
//hết cho 4 và không chia kết cho 100, hoặc năm phải chia hết cho 400.
//Thứ trong tuần tính theo công thức Zeller3:
//dayofweek = (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7
//với:  a = (14 - month) / 12
//y = year - a
//        m = month + 12 * a - 2
//dayofweek: 0 (Chúa nhật), 1 (thứ hai), 2 (thứ ba), …

import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngay, thang, nam;
        int a, y, m;
        int dayofweek;

        System.out.print("Nhập ngày: ");
        ngay = sc.nextInt();
        System.out.print("Nhập tháng: ");
        thang = sc.nextInt();
        System.out.print("Nhập năm: ");
        nam = sc.nextInt();

        if (thang < 1 || thang > 12 || ngay < 1 || ngay > 31) {
            System.out.println("Ngày hoặc tháng không hợp lệ.");
            return;
        }
        if ((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay > 30) {
            System.out.println("Tháng này chỉ có 30 ngày.");
            return;
        }
        if (thang == 2) {
            if (isLeapYear(nam) && ngay > 29) {
                System.out.println("Tháng 2 năm nhuận chỉ có 29 ngày.");
                return;
            }
            if (!isLeapYear(nam) && ngay > 28) {
                System.out.println("Tháng 2 năm không nhuận chỉ có 28 ngày.");
                return;
            }
        }

        System.out.println("hợp lệ.");

        a = (14 - thang) / 12;
        y = nam - a;
        m = thang + 12 * a - 2;
        dayofweek = (ngay + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        String[] Array = {"Chủ Nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7"};
        System.out.println("Thứ " + Array[dayofweek]);
    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

