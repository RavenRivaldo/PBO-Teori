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
public class Final {
    public static void main(String[] args) {
        final Double nilai = 3.14;
        nilai = 12.2 ;
        
        System.out.println(nilai);
        //Error
        //Karena nilai dari suatu variabel final tidak dapat diubah setelah sebelumnya ditetapkan
    }
}
