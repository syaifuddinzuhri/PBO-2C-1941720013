package Praktikum.source_code;

public class Hp {
  private int harga, jumlahHp;
  private String merek;

  public void setHarga(int newValue) {
    harga = newValue;
  }

  public void setJumlah(int newValue) {
    jumlahHp = newValue;
  }

  public void setMerek(String newValue) {
    merek = newValue;
  }

  public int tambahJumlah(int j) {
    jumlahHp += j;
    return jumlahHp;
  }

  public void info() {
    System.out.println("\n---------------------------------------");
    System.out.println("Merek HP\t\t: " + merek);
    System.out.println("Harga HP\t\t: Rp." + harga);
    System.out.println("Jumlah HP\t\t: " + jumlahHp);
    System.out.println("---------------------------------------");
  }
}