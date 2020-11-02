public class TampilPersegi extends Persegi {
   public static void main(String[] args) {
      Persegi p1 = new Persegi();
      p1.sisi = 10;
      p1.tampilSisiPanjang();
      System.out.println("Luas persegi : " + p1.hitungLuas());
      System.out.println("Keliling persegi : " + p1.hitungKeliling());
   }
}