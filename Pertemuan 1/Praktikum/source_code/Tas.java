package Praktikum.source_code;

public class Tas {
  private int harga;
  private String jenis, warna;

  public void setHarga(int newValue) {
    harga = newValue;
  }

  public void setJenis(String newValue) {
    jenis = newValue;
  }

  public void setWarna(String newValue) {
    warna = newValue;
  }

  public int tambahDiskon(int newValue) {
    harga = (harga * newValue) / 100;
    return harga;
  }

  public void info() {
    System.out.println("\n---------------------------------------");
    System.out.println("Jenis Tas\t\t: " + jenis);
    System.out.println("Warna Tas\t\t: " + warna);
    System.out.println("Harga Tas\t\t: Rp." + harga);
    System.out.println("---------------------------------------");
  }
}