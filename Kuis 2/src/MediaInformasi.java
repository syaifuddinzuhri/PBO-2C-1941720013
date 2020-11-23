public class MediaInformasi implements Penerbit {

  public int jmlHalaman;
  private int tahunSekarang;

  public int getTahunSekarang(int tahun) {
    this.tahunSekarang = tahun;
    return this.tahunSekarang;
  }

  public void setJmlHalaman(int jml) {
    this.jmlHalaman = jml;
  }

  public void reputasi() {
  }

  public void alamatPenerbit(String alamat) {
    System.out.println("\nAlamat Penerbit : " + alamat);
  }

  public void tahunBerdiri(int tahun) {
    System.out.println("\nPenerbit ini berdiri pada tahun: " + tahun + ", sehingga Penerbit ini sekarang berusia: "
        + (this.tahunSekarang - tahun) + " tahun");
  }
}
