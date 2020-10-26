/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Master
 */
public class DemoManusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        infoManusia(manusia);
        infoDosen(dosen);
        infoMahasiswa(mahasiswa);
    }
    
    public static void infoManusia(Manusia manusia){
        manusia.bernafas();
        manusia.makan();
    }
    
    public static void infoDosen(Dosen dosen){
        dosen.makan();
        dosen.lembur();
    }
    
    public static void infoMahasiswa(Mahasiswa mahasiswa){
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
