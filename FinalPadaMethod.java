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
class FinalPadaMethod {
    public final void test(){
         System.out.println("Test Prinr Bapak");
    }
}

class Anak extends FinalPadaMethod{
    public void test(){
        System.out.println("Test Print Anak");
    }
}

class HelloWorld(){
    public static void main(String[] args) {
        Anak a = new Anak();
        a.test();
    }
}

    // Error
    // Karena method yang bersifat final tidak dapat di override. makanya saat compile juga akan menghasilkan error. 
