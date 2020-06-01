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
public class Konversi_Tipe_Data_Primitif {
    public static void main(String[] args){
        
        //Mengkonversi Tipe Data Primitif ke Wrapper Class (Referensi)
        char karakter = 'W';
        int angka = 256;
        boolean status = true;
        double pecahan = 67.3;
        
        Character ConvChar = Character.valueOf(karakter); //Konversi char ke Charcter
        Integer ConvInt = Integer.valueOf(angka); //Konversi int ke Integer
        Boolean ConvBoolaen = Boolean.valueOf(status); //Konversi boolean ke Boolean
        Double ConvDouble = Double.valueOf(pecahan); //Konversi double ke Double
        
        //Mengkonversi Tipe Data Wrapper Class (Referensi) ke Primitif
        Character refChar = new Character('W');
        Integer refInt = new Integer(332);
        Boolean refBoolean = new Boolean(true);
        Double refDouble = new Double(84.63);
        
        char primChar = refChar.charValue(); //Konversi Charcter ke char
        int primInt = refInt.intValue(); //Konversi Integer ke int
        boolean primBoolean = refBoolean.booleanValue(); //Boolean char ke boolean
        double primDouble = refDouble.doubleValue(); //Konversi Double ke double
    }
}
