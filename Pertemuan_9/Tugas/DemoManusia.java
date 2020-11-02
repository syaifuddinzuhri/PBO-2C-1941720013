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
        // Method dynamic dispatch
        Manusia manusia;

        manusia = new Manusia();
        manusia.makan();

        manusia = new Dosen();
        manusia.makan();

        manusia = new Mahasiswa();
        manusia.makan();

        System.out.println("======================");

        Manusia m = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        infoManusia(m);
        infoDosen(dsn);
        infoMahasiswa(mhs);
    }

    public static void infoManusia(Manusia manusia) {
        manusia.bernafas();
        manusia.makan();
    }

    public static void infoDosen(Dosen dosen) {
        dosen.makan();
        dosen.lembur();
    }

    public static void infoMahasiswa(Mahasiswa mahasiswa) {
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
