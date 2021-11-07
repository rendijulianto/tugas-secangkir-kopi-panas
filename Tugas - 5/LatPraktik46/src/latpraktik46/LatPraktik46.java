/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latpraktik46;

/**
 *
 * @author kepob
 */

class kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan method dengan paramter
    
    kotak() {
        panjang=4;
        lebar=3;
        tinggi=2;
    }
    
    double hitung_volume() {
        return (panjang*lebar*tinggi);
    } 
}
public class LatPraktik46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        //Membuat objek
        kotak k1 = new kotak();
        System.out.println("Volume K1 = "+k1.hitung_volume());
        
        kotak k2 = new kotak();
        System.out.println("Volume K2 = "+k2.hitung_volume());
    }
    
}
