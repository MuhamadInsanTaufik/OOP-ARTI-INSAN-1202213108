package modul2_insan;

public class Sampan extends TransportasiAir{
    protected int layar;
    
    public Sampan (int layar, int jumlahKursi, int biaya){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+ jumlahKursi +" ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan berlayar menggunakan "+ layar+" layar");
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh menggunakan" + jangkar);
    }
    
}
