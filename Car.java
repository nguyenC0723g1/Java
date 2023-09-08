public class Car {
    public String name;
    public double weight;
    public String color;
    public int soBanh;
    public Car(String name,double weight, String color, int soBanh){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.soBanh = soBanh;
    }
    public void go(){
        System.out.println(this.name + " dang bay");
    }
}
class Main1{
    public static void main(String[] args){
        Car oto1 = new Car("mec", 3, "red", 4);
        oto1.go();
        Car oto2 = new Car("G63", 3,"blue", 4);
        oto2.go();
    }
}

