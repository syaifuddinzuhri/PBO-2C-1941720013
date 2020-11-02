
public class Dosen {
   private int idDosen;
   private String namaDosen;

   public String setNama(String newValue) {
      namaDosen = newValue;
      return namaDosen;
   }

   public int setIdDosen(int newValue) {
      idDosen = newValue;
      return idDosen;
   }

   public void infoDosen() {
      System.out.println("ID Dosen : " + idDosen);
      System.out.println("Nama Dosen : " + namaDosen);
   }

   public static void main(String[] args) {
      Dosen dsn1 = new Dosen();
      Nilai nil1 = new Nilai();
      Mahasiswa mhs1 = new Mahasiswa();
      MataKuliah mk1 = new MataKuliah();

      mhs1.setNim(1941720013);
      mhs1.setNamaMhs("Syaifuddin");
      mhs1.setKelas("TI-1C");
      mhs1.setSemester(3);

      mk1.setKodeMatkul("PBO1");
      mk1.setMatkul("Pemrograman Berbasis Objek");
      mk1.setSks(6);

      nil1.setNilai(100);

      dsn1.setIdDosen(133);
      dsn1.setNama("Pak Enggar");

      mhs1.infoMhs();
      mk1.infoMatkul();
      nil1.infoNilai();
      dsn1.infoDosen();
   }

}