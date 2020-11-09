/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu11;

/**
 *
 * @author syaifuddin
 */
public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Hehehehe", "Abu-abu", "Keledai", 4);
        Gorilla gorilla = new Gorilla("Haaum haaum", "Hitam Manis", "Gulali", 4);
        Singa singa = new Singa("Roaar roaaaar", "Coklat", "CingaCing", 4);
        
        keledai.displayMakan();
        keledai.displayBinatang();
        keledai.displayData();
    
        System.out.println("");
        
        gorilla.displayMakan();
        gorilla.displayBinatang();
        gorilla.displayData();
        
        System.out.println("");
        
        singa.displayMakan();
        singa.displayBinatang();
        singa.displayData();
    }
}
