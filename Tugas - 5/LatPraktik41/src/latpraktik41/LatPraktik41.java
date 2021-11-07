/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latpraktik41;

/**
 *
 * @author kepob
 */

class kotak {
    double panjang;
    double lebar;
    double tinggi;
    double volume;
}

public class LatPraktik41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Membuat objek
        kotak k = new kotak();
        //Mengisikan nilai ke dalam data data kelas kotak
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;
        
        //Proses
        k.volume = k.panjang * k.tinggi*k.lebar;
        
        System.out.println("Volume Kotak = " + k.volume);
    }
    
    
}
