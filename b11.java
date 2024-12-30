import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tySoHuman = 0;
        int tySoComputer = 0;

        System.out.println("Nhập ký tự b (Bao), d (Đá), k (Kéo). Nhập ký tự khác để thoát.");

        while (true) {
            System.out.print("Nhập lựa chọn của bạn: ");
            String nhap = sc.nextLine();

            if (!nhap.equalsIgnoreCase("b") && !nhap.equalsIgnoreCase("d") && !nhap.equalsIgnoreCase("k")) {
                System.out.println("Kết thúc trò chơi!");
                break;
            }

            String[] Array = {"b", "d", "k"};
            int randomIndex = (int) (Math.random() * 3);
            String computer = Array[randomIndex];

            System.out.println("Máy tính chọn: " + (computer.equals("b") ? "Bao" : computer.equals("d") ? "Đá" : "Kéo"));

            if (nhap.equalsIgnoreCase(computer)) {
                System.out.println("Kết quả: Hòa!");
            } else if ((nhap.equalsIgnoreCase("b") && computer.equals("d")) ||
                    (nhap.equalsIgnoreCase("d") && computer.equals("k")) ||
                    (nhap.equalsIgnoreCase("k") && computer.equals("b"))) {
                System.out.println("Kết quả: Bạn thắng!");
                tySoHuman++;
            } else {
                System.out.println("Kết quả: Máy thắng!");
                tySoComputer++;
            }

            System.out.println("Tỷ số: Human - Computer = " + tySoHuman + " - " + tySoComputer);
        }

        System.out.println("Trò chơi kết thúc. Tỷ số cuối cùng: Human - Computer = " + tySoHuman + " - " + tySoComputer);
    }
}
