package Minggu12.Teori;

public class Manajer extends Pegawai {
  private int tunjangan;

  public Manajer(String nama, int gaji, int tunjangan) {
    super(nama, gaji);
    this.tunjangan = tunjangan;
  }

  public int getTunjangan() {
    return this.tunjangan;
  }

  @Override
  public int getGaji() {
    return this.gaji;
  }
}
