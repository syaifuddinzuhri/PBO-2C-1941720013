public class DemoPeminjaman {
  public static void main(String[] args) {
    Peminjaman pjm1 = new Peminjaman();
    pjm1.id = 105;
    pjm1.namaMember = "Syaifuddin Zuhri";
    pjm1.namaGame = "Mortal Combat";
    pjm1.harga = 20000;
    int lama = 5;
    pjm1.tampilData();
    System.out.println("Lama sewa\t: " + lama + " hari");
    System.out.println("Total harga\t: Rp." + pjm1.totalHarga(lama));
    System.out.println("----------------------------------------");
  }
}
