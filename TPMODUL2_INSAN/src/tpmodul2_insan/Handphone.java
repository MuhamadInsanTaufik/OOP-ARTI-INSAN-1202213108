package tpmodul2_insan;

public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(boolean fingerprint, String drive, int ram, float processor) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu handphone ini "
                + (fingerprint == false ? "Tidak memiliki " : "memiliki ") + "fingeprint");
    }

    public void WA(String akunWA) {
        System.out.println("Handphone berhasil menyambungkan WA ke akun " + akunWA);
    }

    public void kirimWA(String nama) {
        System.out.println("Handphone berhasil mengirim WA " + nama);
    }

    public void kirimWA2(String nama, String namalain) {
        System.out.println("Handphone berhasil mengirim WA ke " + nama + " " + "dan " + namalain);
    }
}