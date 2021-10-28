/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pertemuan_4_2;
import java.util.Scanner;
/**
 *
 * @author kepob
 */
public class persegi {
      double sisi;
    
    double hitungluas() {
        return sisi*sisi;
    }
    
    void isi_sisi() {
        int s;
        Scanner Input = new Scanner(System.in); 
        System.out.print("Masukan sisi : ");
        s = Input.nextInt();
        sisi = (double) s;
    }
}
