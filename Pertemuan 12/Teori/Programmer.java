package Minggu12.Teori;

public class Programmer extends Pegawai {
  private int bonus;

  public Programmer(String nama, int gaji, int bonus) {
    super(nama, gaji);
    this.bonus = bonus;
  }

  public int getBonus() {
    return this.bonus;
  }

  @Override
  public int getGaji() {
    return this.gaji;
  }
}
