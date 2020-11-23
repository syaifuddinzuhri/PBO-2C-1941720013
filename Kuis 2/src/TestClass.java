public class TestClass {
  public static void Proses(MediaInformasi med) {
    if (med instanceof Majalah) {
      System.out.println("\nMajalah adalah media informasi!\n");
    } else if (med instanceof Buku) {
      System.out.println("Buku adalah media informasi!\n");
    } else {
      System.out.println("Kategori belum diketahui!");
    }
  }

  public static void main(String[] args) {
    Majalah maj = new Majalah();
    Buku buk = new Buku();
    Proses(maj);
    Proses(buk);

    System.out.println("-------------------------------------------------------------------------------------------\n");

    MediaInformasi medMaj = new Majalah();
    medMaj.setJmlHalaman(46);
    medMaj.reputasi();
    medMaj.alamatPenerbit("Malang");
    int tahunSekarang = medMaj.getTahunSekarang(2020);
    medMaj.tahunBerdiri(1995);

    System.out
        .println("\n-------------------------------------------------------------------------------------------\n");

    MediaInformasi medBuk = new Buku();
    medBuk.setJmlHalaman(340);
    medBuk.reputasi();
    medBuk.alamatPenerbit("Surabaya");
    medBuk.getTahunSekarang(2030);
    medBuk.tahunBerdiri(1978);
  }
}
