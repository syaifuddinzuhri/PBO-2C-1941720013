package Percobaan1;

/**
 *
 * @author Master
 */
public class StaffHarian extends Staff{
    public int jmlJamKerja;

    public StaffHarian() {
    }

    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji,int lembur, int potongan, int jmlJamKerja) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("============= Data Staff Harian =============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja: "+ jmlJamKerja);
        System.out.println("Gaji Bersih\t: "+(gaji*jmlJamKerja+lembur-potongan));
    }
}