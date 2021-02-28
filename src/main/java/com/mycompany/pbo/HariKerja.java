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
public class HariKerja {
    private int _pilihan;
    
    public void run(){
        Main.printLn("Pilihan:\n"
                + "1. Senin\n"
                + "2. Selasa\n"
                + "3. Rabu\n"
                + "4. Kamis\n"
                + "5. Jum'at\n"
                + "6. Sabtu\n"
                + "7. Minggu\n");
        Main.print("Pilihan:");
        _pilihan = Main.getScanner().nextInt();
        Main.printLn("Pilihan :"+_pilihan);
        Main.printLn(getHari());
        
        
    }
    private String getHari(){
        switch(_pilihan){
            case 1:
                return "Hari Kerja";   
            case 2:
               return "Hari Kerja";
            case 3:
                return "Hari Kerja";
            case 4:
                return "Hari Kerja";
            case 5:
                return "Hari Kerja";
            case 6:
                return "Hari Kerja";
            case 7:
                return "Hari Libur";
            default:
                return "Pilihan Salah";
        }
        
    }
}
