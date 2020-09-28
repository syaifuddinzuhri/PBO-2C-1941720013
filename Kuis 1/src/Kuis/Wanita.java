/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

/**
 *
 * @author Syaifuddin
 */
public class Wanita extends Manusia{
    private Pria suami;
    private Manusia anak;

    public Wanita() {
    }

    public Wanita(Pria suami, Manusia anak) {
        this.suami = suami;
        this.anak = anak;
    }

    public Wanita(Pria suami, Manusia anak, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.suami = suami;
        this.anak = anak;
    }

    public Pria getSuami() {
        return suami;
    }

    public void setSuami(Pria suami) {
        this.suami = suami;
    }

    public Manusia getAnak() {
        return anak;
    }

    public void setAnak(Manusia anak) {
        this.anak = anak;
    }
    
    public void cekIstri(){
        if(super.getUmur() >= 20){
            super.setDewasa(true);
            if(suami.getUmur() >= 22){
                suami.setDewasa(true);
            } else {
                suami.setDewasa(false);
            }
            suami.info();
            System.out.println("\n------------------ Data Anak ------------------");
            anak.info();
        } else {
            super.setDewasa(false);
            System.out.println("\n!!! Wanita ini masih kuliah !!!");
        }
    }
    
    public void info(){
        System.out.println("\n----------------- Data Wanita -----------------");
        super.info();
    }
    
}
