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
    
    public static void main(String[] args) {
	// TODO code application logic here
       Main main = new Main();
       main.run();

    }
    public void run(){
       scanner = new Scanner(System.in);
       
       
       nilaiUjian = new NilaiUjian();
       predikatCumlaude = new PredikatCumlaude();
       
       printLn("==== Program PBO ====");
       printLn("1. Nilai Huruf");
        printLn("2. Predikat");
       printLn("Masukkan Pilihan (1-10)=");
       int pilihan = scanner.nextInt();
       switch(pilihan){
           case 1:
               nilaiUjian.run();
               break;
           case 2:
               predikatCumlaude.run();
               break;
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
