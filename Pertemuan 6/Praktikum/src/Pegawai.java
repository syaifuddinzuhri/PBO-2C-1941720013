package Praktikum;

/**
 *
 * @author Master
 */
public class Pegawai {
    public String nip, nama, alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }
    
    public int getGaji(){
        return 150000;
    }
    
}
