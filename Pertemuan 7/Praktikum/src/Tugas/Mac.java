package Tugas;

/**
 *
 * @author Master
 */
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBaterai, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProcessor, kecProcessor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilData();
        System.out.println("Security\t\t: "+security);
    }
}
