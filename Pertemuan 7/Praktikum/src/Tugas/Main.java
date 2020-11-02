package Tugas;

/**
 *
 * @author Master
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=============== Objek Class Laptop ===============");
        Laptop L = new Laptop("Ni-MH", "Lenovo Legion 5", "AMD Ryzen 7 4800H", 2, 16);
        L.tampilLaptop();
        
        System.out.println("");
        
        System.out.println("=============== Objek Class PC ===============");
        Pc P = new Pc(22, "MSI", "AMD Ryzen 5 3400G", 2 , 32);
        P.tampilPc();
        
        System.out.println("");
        
        System.out.println("=============== Objek Class Laptop Mac ===============");
        Mac M = new Mac("Apple T2 chip", "Ni-MH", "MacBook Pro", "Intel Core i5 quad-core", 1, 8);
        M.tampilMac();
        
        System.out.println("");
        
        System.out.println("=============== Objek Class Laptop Windows ===============");
        Windows W = new Windows("Lampu RGB (Anime Matrix)", "Ni-MH", "Asus ROG Zephyrus G14", "AMD Ryzen 9 4900HS", 2, 16);
        W.tampilWindows();
    }
}
