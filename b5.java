import java.util.Scanner;

//
//Bài 5: Viết chương trình nhập vào tọa độ các đỉnh của tam giác ABC và của điểm M.
//xác định điểm M nằm trong, nằm trên cạnh hay nằm ngoài tam giác ABC.

//MAB + MBC + MCA voi ABC

public class b5 {
    double area(double xA, double yA, double xB, double yB, double xC, double yC) {
        return 0.5 * Math.abs(xA * yB - xB * yA + xB * yC - xC * yB + xC * yA - xA * yC);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("xA = ");double xA = sc.nextDouble();
        System.out.println("xB = ");double xB = sc.nextDouble();
        System.out.println("xC = ");double xC = sc.nextDouble();
        System.out.println("yA = ");double yA = sc.nextDouble();
        System.out.println("yB = ");double yB = sc.nextDouble();
        System.out.println("yC = ");double yC = sc.nextDouble();
        System.out.println("xM = ");double xM = sc.nextDouble();
        System.out.println("yM = ");double yM = sc.nextDouble();
        b5 instance = new b5();
        double sABC = (Math.abs(xA * yB - xB * yA + xB * yC - xC * yB + xC * yA - xA * yC)) / 2;
        System.out.println("Diện tích tam giác ABC = " + sABC);
        double d = instance.area(xM, yM, xA, yA, xB, yB) +
                instance.area(xM, yM, xA, yA, xC, yC) +
                instance.area(xM, yM, xB, yB, xC, yC) -
                instance.area(xA, yA, xB, yB, xC, yC);
        if (d > 0) {System.out.println("M nằm ngoài tam giác");}
        else if(instance.area(xM, yM, xA, yA, xB, yB) == 0 ||
                instance.area(xM, yM, xA, yA, xC, yC) == 0 ||
                instance.area(xM, yM, xB, yB, xC, yC) == 0) {System.out.println("M nằm trên cạnh tam giác ABC");}
        else {System.out.println("M nằm trong tam giác ABC");
        }
    }
}

