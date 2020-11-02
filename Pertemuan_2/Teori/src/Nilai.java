public class Nilai {
   private int nilai;

   public int setNilai(int newValue) {
      nilai = newValue;
      return nilai;
   }

   public int tambahNilai(int inc) {
      nilai += inc;
      return nilai;
   }

   public int kurangiNilai(int dec) {
      nilai -= dec;
      return nilai;
   }

   public void infoNilai() {
      System.out.println("Nilai : " + nilai);
   }

}