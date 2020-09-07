public class DemoBarang {
  public static void main(String[] args) {
    Barang brg1 = new Barang();
    brg1.kode = "P100";
    brg1.namaBarang = "Laptop";
    brg1.hargaDasar = 3000000;
    brg1.diskon = 15;
    int hargaJual = brg1.hitungHargaJual();
    brg1.tampilData();
    System.out.println("Harga jual : Rp. " + hargaJual);
    System.out.println("-----------------------------------");
  }
}
