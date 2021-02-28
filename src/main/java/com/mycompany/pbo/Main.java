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
    
    public static void main(String[] args) {
	// TODO code application logic here
       Main main = new Main();
       main.run();

    }
    public void run(){
       scanner = new Scanner(System.in);
       
       
       nilaiUjian = new NilaiUjian();
       printLn("==== Program PBO ====");
       printLn("1. Nilai Huruf");
       print("Masukkan Pilihan (1-10)=");
       int pilihan = scanner.nextInt();
       switch(pilihan){
           case 1:
               nilaiUjian.inputNilai();
               break;
       }      
    }
    
    public static void print(String message){
        System.out.print(message);
    }
    
    public static void printLn(String message){
        System.out.println(message);
    }
}
