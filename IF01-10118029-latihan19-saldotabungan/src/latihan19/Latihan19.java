/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi saldo tabungan
 */
public class Latihan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inputan
        Scanner input = new Scanner(System.in);
        System.out.print("Saldo awal :Rp. ");
        int saldo = input.nextInt();
        System.out.print("Buna/Bulan(%) : ");
        int bunga = input.nextInt();
        System.out.print("Lama(bulan) : ");
        int lama = input.nextInt();
        
        //validasi
        int i = 1;
        saldo = 2500000;
        while (i <= lama){
         bunga = saldo * 15/100;
         saldo = bunga + saldo;
         i++;
          System.out.println("Saldo di bulan ke- " + i +"Rp."+saldo);
        } 
         
       
              
    }
    
}
