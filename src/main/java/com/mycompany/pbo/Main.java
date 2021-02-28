/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo;

import java.util.Scanner;

/**
 *
 * @author Kaila Indonesia
 */
public class Main {
    private Scanner scanner;
    private NilaiUjian nilaiUjian;
    private PredikatCumlaude predikatCumlaude;
    private HireKaryawan hireKaryawan;
    private HariKerja hariKerja;
    private BilanganGenapGanjil bilanganGenap;
    private Penjumlahan penjumlahan;
    private Matrix matrix;
    
    public static void main(String[] args) {
	// TODO code application logic here
       Main main = new Main();
       main.run();

    }
    public void run(){
       scanner = new Scanner(System.in);
       
       
       nilaiUjian = new NilaiUjian();
       predikatCumlaude = new PredikatCumlaude();
       hireKaryawan = new HireKaryawan();
       hariKerja = new HariKerja();
       bilanganGenap = new BilanganGenapGanjil();
       penjumlahan = new Penjumlahan();
       matrix = new Matrix();
       
       printLn("==== Program PBO ====");
       printLn("1. Nilai Huruf");
       printLn("2. Predikat");
       printLn("3. Seleksi Karyawan");
       printLn("4. Hari Kerja");
       printLn("5. Bilangan Genap");
       printLn("6. Bilangan Ganjil");
       printLn("7. Penjumlahan Loop");
       printLn("8. Penjumlahan Matriks");
       printLn("9. Pengurangan Matriks");
       printLn("10. Perkalian Matriks");
       printLn("Masukkan Pilihan (1-10)=");
       int pilihan = scanner.nextInt();
       switch(pilihan){
           case 1:
               nilaiUjian.run();
               break;
           case 2:
               predikatCumlaude.run();
               break;
           case 3:
                hireKaryawan.run();
                break;
           case 4:
                hariKerja.run();
                break;
           case 5:
                bilanganGenap.runGenap();
                break;
           case 6:
                bilanganGenap.runGanjil();
                break;
           case 7:
                penjumlahan.run();
                break;
           case 8:
                matrix.runMatrixBasic();
                break;
           case 9:
               matrix.runMatrixAdvance();
                break;
           case 10:
               matrix.runMatrix();
                break;
           default:
                printLn("Pilihan Salah");
       }      
    }
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    public static void print(String message){
        System.out.print(message);
    }
    
    public static void printLn(String message){
        System.out.println(message);
    }
}
