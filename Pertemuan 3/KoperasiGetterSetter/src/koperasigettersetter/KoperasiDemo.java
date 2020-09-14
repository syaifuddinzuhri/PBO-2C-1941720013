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
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
//        Anggota anggota1 = new Anggota("Iwan", "Jalan Suhat");
        
//        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Suhat");
        anggota1.setor(10000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
        anggota1.pinjam(500);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
    }
}
