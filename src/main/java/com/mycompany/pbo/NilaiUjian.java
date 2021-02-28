/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo;

import com.mycompany.pbo.Main;
import java.util.Scanner;
/**
 *
 * @author Kaila Indonesia
 */
public class NilaiUjian {
    /**
     * 
     */
    private double _nilai;
    
    public void run(){
        Main.printLn("Inputkan Nilai (0-100) = ");
        _nilai = Main.getScanner().nextDouble();
        Main.printLn("Nilai Huruf Anda = "+cekNilai(_nilai));
    }
    
    private String cekNilai(Double nilai){
        if(nilai <= 100){
            return "A (Excelent)";
        }else if(nilai<= 80){
            return "B (Baik)";
        }else if(nilai <= 60){
            return "C (Cukup)";
        }else if(nilai <= 20){
            return  "D (Buruk)";
        }else{
            return "E (Sangat Buruk)";
        }
    }
}
