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
final class FinalPadaClass {
    public final void test(){
        System.out.println("Test print Nama");
    }
}

class HelloWorld extends FinalPadaClass{
    public static void main(String[] args) {
        FinalPadaClass f = new FinalPadaClass();
        f.test();
    }
}
    // Error
    // Karena disini class FinalPadaClass tidak dapat diturunkan karena class tersebut bersifat final atau tetap
    
