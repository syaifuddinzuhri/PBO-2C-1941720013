package percobaan.code;

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
