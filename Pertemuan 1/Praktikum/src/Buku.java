package Praktikum.src;

public class Buku {
  private String penerbit, judulBuku, jenisBuku;
  private int tahunTerbit, jumlah;

  public void setJudul(String newValue) {
    judulBuku = newValue;
  }

  public void setJenis(String newValue) {
    jenisBuku = newValue;
  }

  public void setPenerbit(String newValue) {
    penerbit = newValue;
  }

  public void setTahunTerbit(int newValue) {
    tahunTerbit = newValue;
  }

  public void setJumlah(int newValue) {
    jumlah = newValue;
  }

  public int tambahBuku(int newValue) {
    jumlah += newValue;
    return jumlah;
  }

  public void info() {
    System.out.println("\n---------------------------------------");
    System.out.println("Judul Buku\t\t: " + judulBuku);
    System.out.println("Jenis Buku\t\t: " + jenisBuku);
    System.out.println("Penerbit\t\t: " + penerbit);
    System.out.println("Tahun Terbit\t\t: " + tahunTerbit);
    System.out.println("Jumlah buku\t\t: " + jumlah);
  }
}