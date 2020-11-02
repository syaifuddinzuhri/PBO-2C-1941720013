package Percobaan.src;

public class SepedaGunung extends Sepeda {
  private String tipeSuspensi;

  public void setTipeSuspensi(String newValue) {
    tipeSuspensi = newValue;
  }

  public void cekStatus() {
    super.cekStatus();
    System.out.println("Tipe suspensi: " + tipeSuspensi);
  }
}
