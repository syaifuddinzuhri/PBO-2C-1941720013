package Praktikum.src;

public class BukuSekolah extends Buku {
  private String jenjang;
  private int bukuKelas;

  public void setJenjang(String newValue) {
    jenjang = newValue;
  }

  public void setBukuKelas(int newValue) {
    bukuKelas = newValue;
  }

  public void info() {
    super.info();
    System.out.println("Kelas\t\t\t: " + bukuKelas);
    System.out.println("Jenjang\t\t\t: " + jenjang);
  }
}