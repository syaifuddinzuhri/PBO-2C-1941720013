public class Barang {
  public String kode;
  public String namaBarang;
  public int hargaDasar;
  public float diskon;

  public int hitungHargaJual() {
    int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
    return hargaJual;
  }

  public void tampilData() {
    System.out.println("\n-----------------------------------");
    System.out.println("Kode barang : " + kode);
    System.out.println("Nama barang : " + namaBarang);
    System.out.println("Harga dasar : Rp. " + hargaDasar);
    System.out.println("Diskon : " + diskon + "%");
  }
}
