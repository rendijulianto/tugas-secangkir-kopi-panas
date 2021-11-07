/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latpraktik44;
class kotak {
    double panjang;
    double lebar;
    double tinggi;
    double hitung_volume() {
        double vol = panjang*lebar*tinggi;
        return vol;
    } 
}
public class LatPraktik44 {
    public static void main(String[] args) {
 	//Membuat objek
        kotak k1 = new kotak();
        kotak k2 = new kotak();
        kotak k3 = new kotak();
        k1.panjang =4;
        k1.lebar=3;
        k1.tinggi=2;
        k2.panjang=6;
        k2.lebar=5;
        k2.tinggi=4;
        k3.panjang=6;
        k3.lebar=2;
        k3.tinggi=6;
       System.out.println("Volume K1 = " + k1.hitung_volume());
       System.out.println("Volume K2 = " + k2.hitung_volume());
       System.out.println("Volume K3 = " + k3.hitung_volume());
    }
}
