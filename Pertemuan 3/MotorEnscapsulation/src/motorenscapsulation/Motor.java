/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorenscapsulation;

/**
 *
 * @author Syaifuddin
 */
public class Motor {

private int kecepatan = 0;
private boolean kontakOn = false;
    
//public int kecepatan = 0;
//public boolean kontakOn = false;

public void nyalakanMesin(){
    kontakOn= true;
}

public void matikanMesin(){
    kontakOn= false;
}

public void tambahKecepatan(){
    if(kontakOn == true){
    kecepatan += 5;
    } else {
        System.out.println("Kecepatan tidak bisa bertambah karena mesin off!\n");}
}
public void kurangiKecepatan(){
    if(kontakOn == true){
    kecepatan -= 5;
    } else {
        System.out.println("Kecepatan tidak bisa berkurang karena mesin off!\n");}
}

public void printStatus(){
    if(kontakOn == true){
        System.out.println("Kontak On");
} else {
        System.out.println("Kontak Off");
    }
    
    System.out.println("Kecepatan " + kecepatan + "\n");
}
}
