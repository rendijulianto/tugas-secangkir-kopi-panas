/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latpraktik47;

/**
 *
 * @author kepob
 */

class kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan method dengan paramter
    
    kotak(double p, double l, double t) {
        panjang=p;
        lebar=l;
        tinggi=t;
    }
    
    double hitung_volume() {
        return (panjang*lebar*tinggi);
    } 
}

public class LatPraktik47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 	//Membuat objek
       kotak k1 = new kotak(4,3,2);
       
       System.out.println("Volume K1 = "+k1.hitung_volume());
    }
    
}
