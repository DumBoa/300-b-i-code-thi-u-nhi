//Viết chương trình nhập vào số x chỉ số đo của một góc, tính bằng phút. Cho
//biết nó thuộc góc vuông thứ bao nhiêu của vòng tròn lượng giác.
//Tính cos(x)

import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xConvert;
        double xNormalized;
        double xRadian;
        double cosx;
        System.out.println("Nhập x");
        double x = sc.nextDouble();

        xConvert = x / 60;

        xNormalized = xConvert % 360;

        if (xNormalized >= 0 && xNormalized < 90) {
            System.out.println("x thuộc góc thứ 1");
        }else if(xNormalized >= 90 && xNormalized < 180){
            System.out.println("x thuộc góc thứ 2");
        }else if(xNormalized >= 180 && xNormalized < 270){
            System.out.println("x thuộc góc thứ 3");
        } else if (xNormalized >= 270 && xNormalized < 360) {
            System.out.println("x thuộc góc thứ 4");
        }

        xRadian = (xNormalized * Math.PI) / 180;
        cosx = Math.cos(xRadian);

        System.out.println("Cos(x) = " + cosx);

    }
}
