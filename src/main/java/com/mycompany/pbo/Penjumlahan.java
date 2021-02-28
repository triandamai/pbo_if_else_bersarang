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
public class Penjumlahan {
    private double[] input={};
    public void run(){
        for (int i = 0; i < 4; i++) {
            Main.printLn("Masukkan bilangan ke-"+i+1);
            input[i] =Main.getScanner().nextDouble();
        }
        
        Main.printLn("Total Jumlah 3 bilangan tsb : "+getTotal());
        
        
    }
    private double getTotal(){
        double total =0;
        for(double data:input){
            total += data;
        }
        
        return total;
    }
}
