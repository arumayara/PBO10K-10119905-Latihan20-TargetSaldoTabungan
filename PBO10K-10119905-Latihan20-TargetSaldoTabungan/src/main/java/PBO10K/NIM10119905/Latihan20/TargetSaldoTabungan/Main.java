/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan20.TargetSaldoTabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Target Saldo Tabungan
 * 
 */
public class Main {
static int akhir;
    static void hitung(int a, int b){
         akhir = (a + (a*b/100));
    }
    
@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator('.');
    formatRp.setGroupingSeparator('.');
    
    kursIndonesia.setDecimalFormatSymbols(formatRp);
    
    int saldo = 3500000;
    int bunga = 8;
    int saldoTarget = 6000000;
    int i=1;
    
        while(saldo <= saldoTarget){
         hitung(saldo,bunga);
         System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(akhir));
         i++;
         saldo = akhir;
        }
        
        
    }
    
}
