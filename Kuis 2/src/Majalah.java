public class Majalah extends MediaInformasi {
  @Override
  public void setJmlHalaman(int jml) {
    super.setJmlHalaman(jml);
    int totalHalaman = super.jmlHalaman + 2;
    System.out.println("Majalah ini memiliki : " + super.jmlHalaman + " Halaman\n");
    System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut adalah : "
        + totalHalaman + " Halaman");
  }

  @Override
  public void reputasi() {
    System.out.println("\nPenerbit Majalah ini bereputasi!");
  }
}
