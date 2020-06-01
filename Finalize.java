/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

/**
 *
 * @author Raven
 */
public class Finalize {
    //Method ini akan ditampilkan jika Garbage Collection bekerja
    public void finalize(){
        System.out.println("Objek Yang Tidak Terpakai Sudah Dibersihkan:");
    }
    
    public static void main(String[] args){
        Runtime RT = Runtime.getRuntime();
        System.out.println("Jumlah Memori Awal: "+RT.totalMemory());
        
        Finalize objek1 = new Finalize(); //Block Satu
        Finalize objek2 = new Finalize(); //Block Dua
        Finalize objek3 = objek1; //Objek3 Mengembalikan Nilai Objek1
        objek1 = null;
        objek2 = null;
        System.out.println("Jumlah Memori Yeng Tersedia Sebelum di GC: "+RT.freeMemory());
        System.gc();
        System.out.println("===========================================");
        System.out.println("Jumlah Memori Yeng Tersedia Setelah di GC: "+RT.freeMemory());
    }
}
