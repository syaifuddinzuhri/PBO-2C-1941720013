package Praktikum;

/**
 *
 * @author Master
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.TARIF_SKS = 120000;
    }
    
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    
    public int getGaji(){
        return (this.jumlahSKS * this.TARIF_SKS) + super.getGaji();
    }
    
}
