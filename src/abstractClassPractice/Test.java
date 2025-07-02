package abstractClassPractice;

public class Test {
    public static void main(String[] args){
        Sedan sedan = new Sedan();
        sedan.startEngine();
        sedan.blowHorn();
        Car.stopEngine();

        Suv suv = new Suv();
        suv.startEngine();
        suv.blowHorn();

    }
}
