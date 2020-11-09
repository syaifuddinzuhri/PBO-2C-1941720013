package uts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class Topeng extends Kerajinan{
    public Ornamen ornamen;

    public Topeng(String asal, String namaKerajinan, Ornamen ornamen) {
        super.asal = asal;
        super.nama = namaKerajinan;
        this.ornamen = ornamen;
    }
    
    public void buatKerajinan(){
        super.harga = 1500000;
    }    
}
