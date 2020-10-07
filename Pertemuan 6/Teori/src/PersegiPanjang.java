/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori;

/**
 *
 * @author Master
 */
public class PersegiPanjang extends BangunDatar {
    
    public float lebar;
    public float panjang;
    
    @Override
    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang\t\t: " + luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang\t: " + kll);
        return kll;
    }
}
