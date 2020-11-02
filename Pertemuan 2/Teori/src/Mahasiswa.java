public class Mahasiswa {
   private int nim;
   private String namaMhs;
   private String kelas;
   private int semester;

   public int setNim(int newValue) {
      nim = newValue;
      return nim;
   }

   public String setNamaMhs(String newValue) {
      namaMhs = newValue;
      return namaMhs;
   }

   public String setKelas(String newValue) {
      kelas = newValue;
      return kelas;
   }

   public int setSemester(int newValue) {
      semester = newValue;
      return semester;
   }

   public void infoMhs() {
      System.out.println("NIM : " + nim);
      System.out.println("Nama : " + namaMhs);
      System.out.println("Kelas : " + kelas);
      System.out.println("Semester : " + semester);
   }

}