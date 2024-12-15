import java.util.Scanner;

//Bài 2: Nhập vào tọa độ 2 điểm A(xA, yA) và B(xB, yB). Tính khoảng cách AB.public class b2
// |AB| = sqrt((xB - xA)^2 + (yB - yA)^2 )
class b2 {
    public static void main(String[] args) {

        double T1 = Math.pow(-5.7 - 3.2, 2);
        double T2 = Math.pow(6.1 - (-1.4), 2);
        System.out.println("|AB| = " + (Math.sqrt(T1 + T2)));
    }
}

