import java.util.Comparator;
import java.util.Scanner;

public class Student {

    public String name;
    public int age;
    public int diem;

    public Student (String name, int age, int diem){
        this.name = name;
        this.age = age;
        this.diem = diem;

    }
    public void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ten");
        name = nhap.nextLine();
        System.out.println("nhap tuoi");
        age = nhap.nextInt();
        System.out.println("nhap diem");
        diem = nhap.nextInt();
    }
    public void display(){
        System.out.println(name + "ten");
        System.out.println(age + "tuoi");
        System.out.println(diem + "diem");
    }

}
class Clas{
    public static void main(String[] args){

    }
}


