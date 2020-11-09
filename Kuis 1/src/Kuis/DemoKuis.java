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
public class DemoKuis {
    public static void main(String[] args) {

        /** OBJEK 1 **/

        Pria p1 = new Pria();
        p1.setNama("Budi Dermawan");
        p1.setUmur(30);

        Wanita w1 = new Wanita();
        w1.setNama("Ratna Sari");
        w1.setUmur(24);

        Manusia anak1 = new Manusia(15, "John Doe", false);

        p1.setIstri(w1);
        w1.setSuami(p1);
        w1.setAnak(anak1);

        System.out.println("***___________ INFORMASI PRIA 1___________***");
        p1.cekPria();
        p1.info();

        System.out.println("\n***___________ INFORMASI WANITA 1 ___________***");
        w1.cekIstri();
        w1.info();

        /** OBJEK 2 **/

        Pria p2 = new Pria();
        p2.setNama("Santoso");
        p2.setUmur(14);

        Wanita w2 = new Wanita();
        w2.setNama("Anisa Rahma");
        w2.setUmur(18);

        Manusia anak2 = new Manusia(25, "Alexander", true);

        p2.setIstri(w2);
        w2.setSuami(p2);
        w2.setAnak(anak2);

        System.out.println("***___________ INFORMASI PRIA 2___________***");
        p2.cekPria();
        p2.info();

        System.out.println("\n***___________ INFORMASI WANITA 2 ___________***");
        w2.cekIstri();
        w2.info();
    }
}
