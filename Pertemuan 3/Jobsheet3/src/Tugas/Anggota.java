package Tugas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaifuddin
 */
public class Anggota {
     private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    private int angsur;


    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman) {
        if(jumlahPinjaman > this.limitPinjaman){
            System.out.println("Maaf, Jumlah peminjaman lebihi limit");
        } else {            
        this.jumlahPinjaman = jumlahPinjaman;
        }

    }

    public void angsur(int angsur) {
//        int minimAngsur = (10 * this.jumlahPinjaman) / 100;
//        if(angsur < minimAngsur){
//            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman saait ini");
//        } else {
//                    this.jumlahPinjaman = this.jumlahPinjaman - angsur;
//        }
        this.jumlahPinjaman = this.jumlahPinjaman - angsur;
    }
}
