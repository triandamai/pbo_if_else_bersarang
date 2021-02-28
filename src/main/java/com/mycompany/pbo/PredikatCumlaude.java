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
public class PredikatCumlaude {
    private double _ip;
    private double _masaStudi;
    
    
    public void run(){
        Main.printLn("Inputkan IP Anda = ");
        _ip = Main.getScanner().nextDouble();
        Main.printLn("Inputkan Masa Studi Anda = ");
        _masaStudi = Main.getScanner().nextDouble();
        
        Main.printLn(cekPredikat());
        
    }
    
    public String cekPredikat(){
        if(_ip <= 3.51){
            if(_masaStudi <=4){
                return "Anda Cumlaude";
            }else{
                return "Anda Tidak Cumlaude";
            }
        }else{
            return "Anda Tidak Cumlaude";
        }
        
    }
}
