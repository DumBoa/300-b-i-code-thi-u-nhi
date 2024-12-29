//Bài 10: Số bảo hiểm xã hội của Canada (SIN - Canadian Social Insurance Number)
//là một số có 9 chữ số, được kiểm tra tính hợp lệ như sau: - Số phải nhất (vị trí là 1, tính từ phải sang), là số kiểm tra (check digit). - Trọng số được tính từ phải qua trái (không tính check digit), bằng s1 + s2:
//        + s1 là tổng các số có vị trí lẻ.
//+ Các số có vị trí chẵn nhân đôi. Nếu kết quả nhân đôi có hai chữ số thì kết quả là
//tổng của hai chữ số này. s2 là tổng các kết quả.
//SIN hợp lệ có tổng trọng số với số kiểm tra chia hết cho 10.
//Ví dụ: SIN 193456787 - Số kiểm tra là 7 (màu xanh tô đậm). - Trọng số là tổng của s1 và s2, với:
//        + s1 = 1 + 3 + 5 + 7 = 16
//        + Các số có vị trí chẵn nhân đôi: (9 * 2) (4 * 2) (6 * 2) (8 * 2)  18 8 12 16
//s2 = (1 + 8) + 8 + (1 + 2) + (1 + 6) = 27
//Trọng số bằng s1 + s2 = 16 + 27 = 43.
//Vì tổng trọng số với số kiểm tra 43 + 7 = 50 chia hết cho 10 nên số SIN hợp lệ.
//Viết chương trình nhập một số SIN. Kiểm tra xem số SIN đó có hợp lệ hay không.
//        Nhập 0 để thoát.


import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumLe = 0;
        int sumChan = 0;
        int n = 9;
        int[] Array = new int[n];
        System.out.println("Nhập mã SIN (Gồm 9 số): ");
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                sumLe += Array[i];
            } else {
                int Chanx2 = Array[i] * 2;
                if (Chanx2 >= 10) {
                    Chanx2 = (Chanx2 / 10) + (Chanx2 % 10);
                }
                sumChan += Chanx2;
            }
        }
        int sum = sumLe + sumChan + Array[n - 1];
        System.out.println("SIN (0 để thoát)");
        if (sum % 10 == 0) {
            System.out.println("SIN Hợp Lệ!");
        } else {
            System.out.println("SIN Không Hợp Lệ!");
        }
    }
}
