/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Syaifuddin
 */
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 30 ){
        this.age = 30;            
        } else {
            this.age = age;
        }
        
//        if(age <= 18 && age >= 30){
//            System.out.println("Input salah");
//        } else {
//            this.age = age;
//        }
    }
    
    
}
