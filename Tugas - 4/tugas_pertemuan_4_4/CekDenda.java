/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pertemuan_4_4;
import java.text.ParseException;
import java.util.Scanner;
/**
 *
 * @author kepob
 */
public class CekDenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner Input = new Scanner(System.in); 
        // TODO code application logic here
        int idAnggota;
        System.out.println("==== APLIKASI RENTAL=====");
        System.out.print("Masukan ID Anggota : ");
        idAnggota = Input.nextInt();
        rental rtl = new rental();
        rtl.cekRental(idAnggota);
    }
    
}
