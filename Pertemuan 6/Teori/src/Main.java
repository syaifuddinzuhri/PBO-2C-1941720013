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
public class Main {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        
        // Persegi Panjang
        persegiPanjang.lebar = 50;
        persegiPanjang.panjang = 40;
        persegiPanjang.luas();
        persegiPanjang.keliling();
                
        // Lingkaran
        lingkaran.r = 27;
        lingkaran.luas();
        lingkaran.keliling();
        
        // Segitiga
        segitiga.alas = 18;
        segitiga.tinggi = 20;
        segitiga.luas();
        segitiga.keliling();
    }
}
