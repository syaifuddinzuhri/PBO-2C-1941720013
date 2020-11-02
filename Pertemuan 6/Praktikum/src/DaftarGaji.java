package Praktikum;

/**
 *
 * @author Master
 */
public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlahPegawai = 0;
    

    public DaftarGaji(int n) {
        listPegawai = new Pegawai[n];
    }
    
    public void addPegawai(Pegawai pegawai){
        listPegawai[jumlahPegawai] = pegawai;
        jumlahPegawai++;
    }
    
    public void printSemuaGaji(){
        for (int i = 0; i < jumlahPegawai; i++) {
            String nama = listPegawai[i].getNama();
            int gaji = listPegawai[i].getGaji();
            System.out.println(nama + " mendapatkan gaji : " + gaji);
        }
    }
    
    
    
}
