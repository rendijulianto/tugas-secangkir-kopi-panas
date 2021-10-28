/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pertemuan_4_5;

/**
 *
 * @author kepob
 */
public class KasusKotak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        kotak ktk = new kotak();
        ktk.lebar = 10;
        ktk.tinggi = 20;
        ktk.panjang =15;
        
        System.out.println("Volume adalah "+ ktk.volume());
    }
}
