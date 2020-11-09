package Kuis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaifuddin
 */
public class Manusia {
    private int umur;
    private String nama;
    private boolean dewasa;

    public Manusia() {
    }

    public Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isDewasa() {
        return dewasa;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }
    
    public void info(){
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Umur\t\t\t: " + this.umur + " tahun");
        System.out.println("Dewasa\t\t\t: " + this.dewasa);
    }
}
