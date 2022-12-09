package modul2_insan;

public class Kapal extends TransportasiAir {
    protected String mesin;
    
    public Kapal (int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah "+ jumlahKursi +" ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+ mesin);
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+ mesin+ " dengan kecepatan "+kecepatan+" km per jam");
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
    
}
