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
    private double[][] _matrixA;
    private double[][] _matrixB;
    private int _baris;
    private int _kolom;
    
    public void runMatrixBasic(){
        _baris =2;
        _kolom = 2;
         _matrixA= new double[_baris][_kolom];
         _matrixB = new double[_baris][_kolom];
        Main.printLn("Masukkan Matriks A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixA[i][j] = Main.getScanner().nextDouble();
            }
        }
        Main.printLn("Masukkan Matriks B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixB[i][j] = Main.getScanner().nextDouble();
            }
        }
        Main.printLn("Matrix A");
        for (double[] ds : _matrixA) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        Main.printLn("Matrix B");
        for (double[] ds : _matrixB) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        
        getHasil(true);
    }
    
    
    public void runMatrixAdvance(){
        Main.print("Program Pengurangan 2 buah matrix");
        Main.printLn("Masukkan jumlah baris matriks =");
        _baris = Main.getScanner().nextInt();
        Main.printLn("Masukkan jumlah kolom matriks =");
        _kolom = Main.getScanner().nextInt();
        
        _matrixA= new double[_baris][_kolom];
        _matrixB = new double[_baris][_kolom];
        Main.printLn("Masukkan Matriks A");
        for (int i = 0; i < _baris; i++) {
            for (int j = 0; j < _kolom; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixA[i][j] = Main.getScanner().nextDouble();
            }
        }
        Main.printLn("Masukkan Matriks B");
        for (int i = 0; i < _baris; i++) {
            for (int j = 0; j < _kolom; j++) {
                Main.printLn("["+(i+1)+"]["+(j+1)+"]");
                _matrixB[i][j] = Main.getScanner().nextDouble();
            }
        }
        Main.printLn("Matrix A");
        for (double[] ds : _matrixA) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        Main.printLn("Matrix B");
        for (double[] ds : _matrixB) {
            for (double d : ds) {
                Main.print(""+d+" ");
            }
            Main.print("\n");
        }
        
        getHasil(false);
    }
    
    private void getHasil(boolean penjumlahan){
        Main.printLn("Hasil Penjumlahan Matriks A dan Matriks B");
        for (int i = 0; i < _baris; i++) {
            for (int j = 0; j < _kolom; j++) {
                 if(penjumlahan){
                    Main.print(""+jumlahkan(_matrixA[i][j], _matrixB[i][j]));
                 }else{
                      Main.print(""+kurangkan(_matrixA[i][j], _matrixB[i][j]));
                 }
            }
            Main.print("\n");
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


