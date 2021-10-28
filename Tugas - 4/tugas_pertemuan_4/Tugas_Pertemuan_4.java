/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pertemuan_4;

/**
 *
 * @author kepob
 */
public class Tugas_Pertemuan_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Menghitung Sisi
        MenghitungLuasStatic luas = new MenghitungLuasStatic();
        double sisi =4;
        luas.sisi=sisi;
        System.out.println("Luas persegi 1 \t = " + luas.hitungLuas());
        sisi=3;
        luas.sisi=sisi;
        System.out.println("Luas persegi 2 \t = " + luas.hitungLuas());
    }
    
}
