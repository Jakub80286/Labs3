package Zad1;

public class Czasomierz extends Thread{

    @Override
    public void run() {
        int sek=0;
        int min=0;
        int godz =0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(godz + ":" + min + ":" + sek);
            sek++;
            if (sek == 60) {
                sek = 0;
                min++;
                if (min == 60) {
                    godz++;
                }
            }
        }
    }
}