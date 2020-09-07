public class DemoLingkaran {
  public static void main(String[] args) {
    Lingkaran l1 = new Lingkaran();
    l1.phi = 22.7;
    l1.r = 7;
    double luas = l1.hitungKeliling();
    double keliling = l1.hitungLuas();
    System.out.println("\n----------------------------");
    System.out.println("Phi\t\t: " + l1.phi);
    System.out.println("Jari-jari\t: " + l1.r);
    System.out.println("----------------------------");
    System.out.println("Luas lingkaran\t: " + luas);
    System.out.println("Luas keliling\t: " + keliling);
    System.out.println("----------------------------");
  }
}
