/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latpraktik45;

/**
 *
 * @author kepob
 */
class kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan method dengan paramter
    
    void isi_data(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi =t;
    }
    
    double hitung_volume() {
        return (panjang*lebar*tinggi);
    }
}

public class LatPraktik45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Membuat objek
        kotak k = new kotak();
        
        //memanggil method isi data;
        k.isi_data(4,3,2);
        
        System.out.println("Volume Kotak = "+k.hitung_volume());
    }
    
}
