package Praktikum.source_code;

public class BukuNovel extends Buku {
  private String kategori;
  private int halaman;

  public void setKategori(String newValue) {
    kategori = newValue;
  }

  public void setHalaman(int newValue) {
    halaman = newValue;
  }

  public void info() {
    super.info();
    System.out.println("Kategori\t\t: " + kategori);
    System.out.println("Jumlah halaman\t\t: " + halaman + " halaman");
  }

}