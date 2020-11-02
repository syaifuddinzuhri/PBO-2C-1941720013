public class MataKuliah {
   private String kodeMatkul;
   private String namaMatkul;
   private int sks;

   public String setKodeMatkul(String newValue) {
      kodeMatkul = newValue;
      return kodeMatkul;
   }

   public String setMatkul(String newValue) {
      namaMatkul = newValue;
      return namaMatkul;
   }

   public int setSks(int newValue) {
      sks = newValue;
      return sks;
   }

   public int tambahSks(int inc) {
      sks += inc;
      return sks;
   }

   public int kurangiSks(int dec) {
      sks -= dec;
      return sks;
   }

   public void infoMatkul() {
      System.out.println("Kode Matkul : " + kodeMatkul);
      System.out.println("Nama Matkul : " + namaMatkul);
      System.out.println("Sks : " + sks);
   }

}