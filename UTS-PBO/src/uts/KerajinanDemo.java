/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Master
 */
public class KerajinanDemo {
    public static void main(String[] args) {
        Topeng topeng = new Topeng("Malang = ", "Topeng Malangan", new Ornamen(200000));
        topeng.buatKerajinan();
        System.out.println("Nama Kerajinan = " + topeng.nama);
        System.out.println("Asal = " + topeng.asal);
        System.out.println("Harga untuk membuat = " + topeng.harga);
        topeng.perbaikiKerajinan();
        System.out.println("Harga untuk memperbaiki = "+ topeng.harga);
        System.out.println("Harga ornamen = "+ topeng.ornamen.harga);
    }
}
