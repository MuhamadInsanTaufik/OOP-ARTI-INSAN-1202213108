package modul2_insan;

public class Main {

       public static void main(String [] args) {
        TransportasiAir air = new TransportasiAir(4, 500000);
        air.informasi();
        air.berlayar ();
        air.berlabuh();
        System.out.println();

        Sampan pan = new Sampan(2, 3, 40000);
        pan.informasi();
        pan.berlayar ();
        pan.berlabuh();
        pan.berlabuh(3);

        System.out.println();

        Kapal pal = new Kapal(5, 600000, "motor");
        pal.informasi();
        pal.berlayar();
        pal.berlayar(20);
        pal.berlabuh();
    }
}
