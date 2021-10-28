/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pertemuan_4_2;

/**
 *
 * @author kepob
 */
public class MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persegi psg = new persegi();
        psg.isi_sisi();
        System.out.println("Luas persegi 1 \t = " + psg.hitungluas());
    }
}
