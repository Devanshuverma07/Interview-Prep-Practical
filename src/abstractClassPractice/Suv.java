package abstractClassPractice;

public class Suv extends Car{
    @Override
    public void startEngine() {
        System.out.println("Suv engine Started");
    }

    @Override
    public void blowHorn() {
        System.out.println("Suv POO POO POO POO");
    }
}
