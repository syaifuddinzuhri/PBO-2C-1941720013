/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu11;

/**
 *
 * @author syaifuddin
 */
public class Gorilla extends Binatang implements Herbivora, Karnivora{

    private String suara, warnaBulu;

    public Gorilla(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("Jumlah Kaki : " + super.getJmlKaki());
    }
    
    public void displayData(){
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}
