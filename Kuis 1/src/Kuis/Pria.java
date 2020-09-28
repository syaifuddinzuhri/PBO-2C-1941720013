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
public class Pria extends Manusia{
    private Wanita istri;

    public Pria() {
    }

    public Pria(Wanita istri) {
        this.istri = istri;
    }

    public Pria(Wanita istri, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.istri = istri;
    }


    public Wanita getIstri() {
        return istri;
    }

    public void setIstri(Wanita istri) {
        this.istri = istri;
    }
    
    public void cekPria(){
        if(super.getUmur() >= 22){
            if(istri != null){
                super.setDewasa(true);
                istri.setDewasa(true);
                istri.info();
            } else {
                super.setDewasa(true);
                System.out.println("\n!!! Pria ini belum mempunyai istri !!!");
            }
        } else {
            super.setDewasa(false);
            System.out.println("\n!!! Pria ini masih kuliah !!!");
        }
    }
    
    public void info(){
        System.out.println("\n------------------ Data Pria ------------------");
        super.info();
    }
}
