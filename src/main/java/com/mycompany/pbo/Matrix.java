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
public class Matrix {
    private int[][] _matrixA;
    private int[][] _matrixB;
    private int _baris;
    private int _kolom;
    
    public void runMatrixBasic(){
        _baris =2;
        _kolom = 2;
        _matrixA= new int[_baris][_kolom];
        _matrixB = new int[_baris][_kolom];
        Main.printLn("Masukkan Matriks A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixA[i][j] = Main.getScanner().nextInt();
            }
        }
        Main.printLn("Masukkan Matriks B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixB[i][j] = Main.getScanner().nextInt();
            }
        }
        Main.printLn("Matrix A");
        for (int[] ds : _matrixA) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        Main.printLn("Matrix B");
        for (int[] ds : _matrixB) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        
        getHasil("penjumlahan");
    }
    
    
    public void runMatrixAdvance(){
        Main.print("Program Pengurangan 2 buah matrix");
        Main.printLn("Masukkan jumlah baris matriks =");
        _baris = Main.getScanner().nextInt();
        Main.printLn("Masukkan jumlah kolom matriks =");
        _kolom = Main.getScanner().nextInt();
        
        _matrixA= new int[_baris][_kolom];
        _matrixB = new int[_baris][_kolom];
        Main.printLn("Masukkan Matriks A");
        for (int i = 0; i < _baris; i++) {
            for (int j = 0; j < _kolom; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixA[i][j] = Main.getScanner().nextInt();
            }
        }
        Main.printLn("Masukkan Matriks B");
        for (int i = 0; i < _baris; i++) {
            for (int j = 0; j < _kolom; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixB[i][j] = Main.getScanner().nextInt();
            }
        }
        Main.printLn("Matrix A");
        for (int[] ds : _matrixA) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        Main.printLn("Matrix B");
        for (int[] ds : _matrixB) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        
        getHasil("pengurangan");
    }
    public void runMatrix(){
           _baris =2;
           _kolom =2;
           _matrixA = new int[_baris][_kolom];
           _matrixB = new int[_baris][_kolom];
           Main.printLn("Masukkan Matriks A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixA[i][j] = Main.getScanner().nextInt();
            }
        }
        Main.print("Masukkan Matriks B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixB[i][j] = Main.getScanner().nextInt();
            }
        }
        Main.printLn("Matrix A");
        for (int[] ds : _matrixA) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        Main.printLn("Matrix B");
        for (int[] ds : _matrixB) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        
        getHasilPerkalian();
    }
    private void getHasil(String hasil){
        Main.printLn("Hasil Penjumlahan Matriks A dan Matriks B");
        for (int i = 0; i < _baris; i++) {
            for (int j = 0; j < _kolom; j++) {
                 if(hasil.equalsIgnoreCase("penjumlahan")){
                    Main.print(""+jumlahkan(_matrixA[i][j], _matrixB[i][j])+" ");
                 }if(hasil.equalsIgnoreCase("pengurangan")){
                     Main.print(""+kurangkan(_matrixA[i][j], _matrixB[i][j])+" ");
                 }else{
                      Main.print(""+kalikan(_matrixA[i][j], _matrixB[i][j])+" ");
                 }
            }
            Main.print("\n");
        }
        
    }
    
    private void getHasilPerkalian(){
        double hasil[][] = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double total =0;
                for (int k = 0; k < 2; k++) {
                    total = total + kalikan(_matrixA[i][k], _matrixB[k][j]);
                }
                hasil[i][j] = total;   
            }   
        }
       Main.printLn("Proses Perkalian Matriks A dan Matriks B");
       Main.printLn(""
               +_matrixA[0][0]+"*"+_matrixB[0][0] +"+"+_matrixA[0][1]+"*"+_matrixB[1][0]+
               "\t"+_matrixA[0][0]+"*"+_matrixB[0][1]+"+"+_matrixA[0][1]+"*"+_matrixB[1][1]+
               "\n" +_matrixA[1][0]+"*"+_matrixB[0][0] +"+"+_matrixA[1][1]+"*"+_matrixB[1][0]+
               "\t"+_matrixA[1][0]+"*"+_matrixB[0][1]+"+"+_matrixA[1][1]+"*"+_matrixB[1][1]);
       Main.printLn("");
       
        Main.printLn("Hasil Perkalian Matriks A Matriks B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.print(""+hasil[i][j]);
            }
            Main.printLn("");
        }
       
    }
    
    private double jumlahkan(double  matrixa ,double  matrixb){
        return (matrixa+matrixb);
    }
    private double kurangkan(double matrixa,double matrixb){
        return (matrixa-matrixb); 
    }
     private double kalikan(double matrixa,double matrixb){
        return (matrixa*matrixb); 
    }
}


