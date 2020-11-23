public class Buku extends MediaInformasi {

  @Override
  public void setJmlHalaman(int jml) {
    super.setJmlHalaman(jml);
    int totalHalaman = super.jmlHalaman + 4;
    System.out.println("Buku ini memiliki : " + super.jmlHalaman + " Halaman\n");
    System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari buku tersebut adalah : " + totalHalaman
        + " Halaman, lebih tebal daripada majalah karena terdapat cover dalam dan cover luar");
  }

  @Override
  public void reputasi() {
    System.out.println("\nPenerbit Buku ini bereputasi!");
  }
}
