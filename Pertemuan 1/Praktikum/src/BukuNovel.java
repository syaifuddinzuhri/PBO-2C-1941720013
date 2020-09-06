package Praktikum.src;

public class BukuNovel extends Buku {
  private String kategori;
  private int halaman;

  public void setKategori(String newValue) {
    kategori = newValue;
  }

  public void setHalaman(int newValue) {
    halaman = newValue;
  }

  public int tambahHalaman(int newValue) {
    halaman += newValue;
    return halaman;
  }

  public int kurangiHalaman(int newValue) {
    halaman -= newValue;
    return halaman;
  }

  public String hapusKategori() {
    kategori = "";
    return kategori;
  }

  public void info() {
    super.info();
    System.out.println("Kategori\t\t: " + kategori);
    System.out.println("Jumlah halaman\t\t: " + halaman + " halaman");
  }

}