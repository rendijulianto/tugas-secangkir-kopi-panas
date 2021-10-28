/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pertemuan_4_4;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;  

/**
 *
 * @author kepob
 */
public class rental {
  
    int getDifferenceDays(Date d1, Date d2) {
        int daysdiff = 0;
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000) + 1;
        daysdiff = (int) diffDays;
        return daysdiff;
    }
      void cekRental(int idAnggota) throws ParseException {
         if(idAnggota == 1) {
              LocalDateTime today = LocalDateTime.now();     //Today
              LocalDateTime tanggal_pinjam = today.minusDays(3);   //Minus 1 day
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
              String formatToday = today.format(formatter);
              String formatTanggalPinjam = tanggal_pinjam.format(formatter);
         
             SimpleDateFormat formatterr = new SimpleDateFormat("dd-MM-yyyy"); 
             int lamaPinjam = getDifferenceDays(formatterr.parse(formatTanggalPinjam), formatterr.parse(formatToday)) - 1 ;
             int telat = lamaPinjam - 2;
             int denda = 2500;
             System.out.println("Nama \t : sukmadi");
             System.out.println("ID Member \t : "+  idAnggota);
             System.out.println("Tanggal Pinjam (dd-mm-yyyy) \t : "+  formatTanggalPinjam);
             System.out.println("Tanggal Kembali (dd-mm-yyyy) \t : "+ formatToday );
             System.out.println("Lama Peminjaman \t : "+ lamaPinjam + " Hari (didapat dari Tanggal kembali - Tanggal Pinjam");
             System.out.println("Telat \t : "+ telat + " Hari");
             System.out.println("Denda \t : Rp "+ telat*denda);
             
         } else {
             System.out.println("ID Anggota " + idAnggota + " Tidak ditemukan!");
         }
     }
}
