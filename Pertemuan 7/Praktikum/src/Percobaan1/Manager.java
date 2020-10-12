package Percobaan1;

/**
 *
 * @author Master
 */
public class Manager extends Karyawan{
    public int tunjangan;
    
    public Manager(){}
    
    public void tampilManager(){
        super.tampilKaryawan();
        System.out.println("Tunjangan\t: "+tunjangan);
        System.out.println("Total Tunjangan\t: "+(super.gaji + tunjangan));
    }
}
