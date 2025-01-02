//Bài 14: Viết chương trình nhập vào ngày, tháng, năm (giả sử nhập đúng, không cần
//kiểm tra hợp lệ). Tìm ngày, tháng, năm của ngày tiếp theo.
//Tương tự, tìm ngày, tháng, năm của ngày ngay trước đó.

import java.util.Scanner;

public class b14 {
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày, tháng, năm: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        day = (day % getDaysInMonth(month, year)) + 1;
        if (day == 1) {
            month = (month % 12) + 1;
            if (month == 1) {
                year++;
            }
        }
        System.out.printf("Ngày mai: %02d/%02d/%d\n", day, month, year);

        System.out.print("Nhập ngày, tháng, năm: ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        if (day == 1) {
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
            day = getDaysInMonth(month, year);
        } else {
            day--;
        }
        System.out.printf("Hôm qua: %02d/%02d/%d\n", day, month, year);

        scanner.close();
    }
}
