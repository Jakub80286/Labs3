package Zad2;

public class Samochod extends Thread {
    private String nrRej;
    private int pojZbiornika;
    private int paliwo=30;

    public Samochod(String nr, int _pojZbiornika) {
        nrRej = nr;
        pojZbiornika = _pojZbiornika;
    }

    public void tankowanie(int _paliwo) {
        if (paliwo > pojZbiornika) {
            paliwo = pojZbiornika;
        } else {
            paliwo = _paliwo;
        }
    }

    public void start() //start samochodu, uruchamiamy wątek zużycia paliwa
    {
        super.start();
    }

    public void STOP() //zatrzymanie samochodu, zatrzymujemy wątek zużycia paliwa
    {
        stop();
    }

    public void run() //kod, który wykonuje się w odrębnym wątku, co 1 s programu zużywany jest 1 litr paliwa
    {
        while (paliwo > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            paliwo--;
            System.out.println(nrRej+" ma jeszcze "+ paliwo +" l paliwa.");
        }
    }
}