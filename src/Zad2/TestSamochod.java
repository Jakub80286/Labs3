package Zad2;

public class TestSamochod {
    Samochod samochod=new Samochod("12345",30);
    Samochod samochod1=new Samochod("111111",30);
    Samochod samochod2=new Samochod("13333",30);
    public void sprawdz(){
        samochod.start();
        samochod1.start();
        samochod2.start();
    }

}
