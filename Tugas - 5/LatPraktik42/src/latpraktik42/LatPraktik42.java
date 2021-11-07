/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latpraktik42;

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

public class LatPraktik42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //deklarasi objek kotak 1
        kotak k1 = new kotak();
        
        //mengisi nilai ke dalam objek k1
        k1.panjang=4;
        k1.lebar=3;
        k1.tinggi=2;
        
        //proses volume k1
        k1.volume = k1.panjang*k1.tinggi*k1.lebar;
        
        //output volume k1
        System.out.println("Volume k1 = "+ k1.volume);
        
        //deklarasi objek kotak 2
        kotak k2 = new kotak();
        
        //mengisi nilai ke dalam objek k1
        k2.panjang=4;
        k2.lebar=9;
        k2.tinggi=2;
        
        //proses volume k2
        k2.volume = k2.panjang*k2.tinggi*k2.lebar;
        
        //output volume k2
        System.out.println("Volume k2 = "+ k2.volume);
    }
    
}
