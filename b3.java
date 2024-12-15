//Bài 3: Viết chương trình nhập vào tọa độ (xC, yC) là tâm của một đường tròn, và R
//là bán kính của đường tròn đó. Nhập vào tọa độ (xM, yM) của điểm M. Xác định điểm
//M nằm trong, nằm trên hay nằm ngoài đường tròn.

//Kiểm tra khoảng cách từ điểm đến tâm của đường tròn. Nếu khoảng cách nhỏ hơn bán kính của đường tròn,
//điểm đó nằm trong đường tròn.
//Nếu khoảng cách lớn hơn bán kính của đường tròn, điểm đó nằm ngoài đường tròn.
//Nếu khoảng cách bằng bán kính của đường tròn, điểm đó nằm trên đường tròn.


//Nhap toa do tam C(xC, yC)? 0.5 4.3 
//Nhap ban kinh R? 7.4 
//Nhap toa do M(xM, yM)? 3.2 6.5 
//M nam trong C()


// Tính khoảng cách trước

public class b3 {
    public static void main(String[] args) {
        double T = Math.pow(3.2 - 0.5, 2);
        double T1 = Math.pow(6.5 - 4.3, 2);
        double R = 7.4;
        double AB = Math.sqrt(T + T1);

        if(AB < R ){
            System.out.println("M nằm trong đường tròn");
        }else if(AB > R ){
            System.out.println("M nằm ngoài đường tròn");
        }else if(AB == R){
            System.out.println("M nằm trên đường tròn");
        }
    }
}
