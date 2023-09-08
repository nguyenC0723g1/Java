import java.util.Scanner;

public class Rectangle {
    public int dai;
    public int rong;

    public Rectangle(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }
   public void go(){
        int S = dai * rong;
       System.out.println("chieu dai " + S);
       int C = (dai + rong) * 2;
       System.out.println("chieu rong " + C);
    }

}
class Hcn {
    public static void main(String[] args) {
        Rectangle Hcn = new Rectangle(6, 4);
        Hcn.go();
    }
}


 class HinhChuNhat {
    double dai, rong;
    public HinhChuNhat() {
    }
    public void setRong(double rong) {
        this.rong = rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    double tinhDienTich() {
        return dai * rong;
    }
    double tinhChuVi() {
        return (dai + rong) * 2;
    }
}
 class Main {
    public static void main(String[] args) {

        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());

    }
}