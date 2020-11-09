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
public class Singa extends Binatang implements Karnivora{
    private String suara, warnaBulu;

    public Singa(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora");
        System.out.println("Makanan : Daging");
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
