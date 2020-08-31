package percobaan.code;

public class Sepeda {
  private String merek;
  private int kecepatan;
  private int gear;

  public void setMerk(String newValue) {
    merek = newValue;
  }

  public void gantiGear(int newValue) {
    gear = newValue;
  }

  public int tambahKecepatan(int increment) {
    kecepatan += increment;
    return kecepatan;
  }

  public int rem(int decrement) {
    kecepatan -= decrement;
    return kecepatan;
  }

  public void cekStatus() {
    System.out.println("Merek: " + merek);
    System.out.println("Kecepatan: " + kecepatan);
    System.out.println("Gear: " + gear);
  }
}
