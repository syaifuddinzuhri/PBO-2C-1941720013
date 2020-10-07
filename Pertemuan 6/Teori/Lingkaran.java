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
public class Lingkaran extends BangunDatar {
    
    public float r;
 
    @Override
    public float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran\t\t\t: " + luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran\t\t: " + keliling);
        return keliling;
    }
}
