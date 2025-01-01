//Bài 12: Viết chương trình giải hệ phương trình 2 ẩn:

import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        double a1,a2,b1,b2,c1,c2,D,Dx,Dy,x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("a1 = "); a1 = sc.nextDouble();
        System.out.println("a2 = "); a2 = sc.nextDouble();
        System.out.println("b1 = "); b1 = sc.nextDouble();
        System.out.println("b2 = "); b2 = sc.nextDouble();
        System.out.println("c1 = "); c1 = sc.nextDouble();
        System.out.println("c2 = "); c2 = sc.nextDouble();
        D = (a1 * b2) - (a2 * b1);
        if(D != 0){
            Dx = (c1 * b2) - (c2 * b1);
            Dy = (c2 * a1) - (c1 * a2) ;

            x = Dx/D;
            y = Dy/D;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

    }
}
