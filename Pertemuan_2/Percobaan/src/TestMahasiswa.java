package src;

public class TestMahasiswa {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nim = 101;
    mhs1.nama = "Lestari";
    mhs1.alamat = "Jl. Vinola 1A";
    mhs1.kelas = "1A";
    mhs1.tampilBiodata();

    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nim = 102;
    mhs2.nama = "Alexa";
    mhs2.alamat = "Jl. Mawar 5A";
    mhs2.kelas = "1C";
    mhs2.tampilBiodata();

    Mahasiswa mhs3 = new Mahasiswa();
    mhs3.nim = 103;
    mhs3.nama = "Abidin";
    mhs3.alamat = "Jl. Macan 10";
    mhs3.kelas = "2C";
    mhs3.tampilBiodata();
  }
}