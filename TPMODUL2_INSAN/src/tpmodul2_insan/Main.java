package tpmodul2_insan;

public class Main {

       public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("Kingston", 48, 5.6f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(true, "Sandisk", 4, 3f);
        hp.informasi();
        hp.WA("Insan");
        hp.kirimWA("Bella");
        hp.kirimWA2("Bella", "Devi");

        System.out.println();

        Laptop laptop = new Laptop("Samsung", 8, 3.2f, true);
        laptop.informasi();
        laptop.bukaAplikasi("Google Chrome");
        laptop.kirimEmail("Insantaufik69@gmail.com");
        laptop.multiEmail("Insantaufik69@gmail.com", "Insantaufik79@mail.com");
    }
}
