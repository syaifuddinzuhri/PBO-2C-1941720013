/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author syaifuddin
 */
public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        sarjanaCumlaude.kuliahDiKampus();
//        System.out.println("----------------");

//        pakrektor.berSeritifikatCumlaude(mhsBiasa);
        pakrektor.berSeritifikatCumlaude(sarjanaCumlaude);
        pakrektor.berSeritifikatCumlaude(masterCumlaude);
    }
}

