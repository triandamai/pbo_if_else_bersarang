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
public class HireKaryawan {
    private boolean _tertulis,_psikotes,_wawancara,_kesehatan;
    private String _name;
    
    public  void run(){
        Main.printLn("Masukkan Nama Calon Karyawan = ");
        _name = Main.getScanner().next();
        Main.printLn("Apakah lulus tes tertulis ? (y/yes,Y/YES)");
        _tertulis = cekJawaban(Main.getScanner().next());
        Main.printLn("Apakah lulus psikotes ? (y/yes,Y/YES)");
        _psikotes = cekJawaban(Main.getScanner().next());
        Main.printLn("Apakah lulus Wawancara ? (y/yes,Y/YES)");
        _wawancara = cekJawaban(Main.getScanner().next());
        Main.printLn("Apakah lulus Kesehatan ? (y/yes,Y/YES)");
        _kesehatan = cekJawaban(Main.getScanner().next());
        
        Main.printLn("Hasil:\nNama: "+_name+"\nHasil:"+getJawaban());
    }
    
    private boolean cekJawaban(String jawaban){
        return jawaban.equalsIgnoreCase("y") && jawaban.equalsIgnoreCase("yes");
    }
    private String getJawaban(){
        if (getHasil()) {
            return "Lulus";
        }
        return "Tidak Lulus";
    }
    private boolean getHasil(){
        return _kesehatan && _wawancara && _psikotes && _tertulis;
    }
}
