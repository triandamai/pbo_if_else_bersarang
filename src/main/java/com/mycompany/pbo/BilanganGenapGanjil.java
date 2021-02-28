/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo;

/**
 *
 * @author Kaila Indonesia
 */
public class BilanganGenapGanjil {
    public void runGenap(){
        Main.printLn("MENCETAK BILANGAN GENAP");
        for (int i = 0; i < 10; i++) {
            if(i%2 ==0){
                Main.printLn(""+i);
            }
        }
    }
    public void runGanjil(){
        Main.printLn("MENCETAK BILANGAN GANJIL");
        for (int i = 0; i < 10; i++) {
            if(i%2 !=0){
                Main.printLn(""+i);
            }
        }
    }
    
}
