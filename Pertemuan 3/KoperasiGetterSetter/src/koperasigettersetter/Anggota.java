/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author Syaifuddin
 */
public class Anggota {

    private String nama;
    private String alamat;
    private float simpanan;

//    public Anggota(String nama, String alamat) {
//        this.nama = nama;
//        this.alamat = alamat;
//        this.simpanan = 0;
//    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang){
        simpanan += uang;
    }
    
    public void pinjam(float uang){
        simpanan -= uang;
    }
    
    
}
