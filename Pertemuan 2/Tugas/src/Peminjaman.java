public class Peminjaman {
  public int id;
  public String namaMember;
  public String namaGame;
  public int harga;

  public int totalHarga(int lamaSewa) {
    int totalHarga = lamaSewa * harga;
    return totalHarga;
  }

  public void tampilData() {
    System.out.println("\n----------------------------------------");
    System.out.println("STRUK PEMINJAMAN");
    System.out.println("----------------------------------------");
    System.out.println("Id\t\t: " + id);
    System.out.println("Nama member\t: " + namaMember);
    System.out.println("Nama game\t: " + namaGame);
    System.out.println("Harga\t\t: Rp." + harga);
  }
}
