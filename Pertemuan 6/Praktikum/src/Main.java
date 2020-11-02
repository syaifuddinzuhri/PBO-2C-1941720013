package Praktikum;

/**
 *
 * @author Master
 */
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("12345", "Syaifuddin", "Pasuruan");
        
        Dosen dosen = new Dosen("18123", "Zuhri", "Malang");
        dosen.setSKS(6);
        
        DaftarGaji daftarGaji = new DaftarGaji(2);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);
        
        daftarGaji.printSemuaGaji();
    }
}
