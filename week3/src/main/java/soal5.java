/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class soal5 {
     public static void main(String[] args){
        Scanner inputan = new Scanner(System.in);
        
        String plat1 = inputan.next();
        String plat2 = inputan.next();
        String plat3 = inputan.next();
        String plat4 = inputan.next();
        
        String gabungan = plat1 + plat2 + plat3 + plat4;
        
        long semua = Long.parseLong(gabungan);
        Long hasil = (semua-999999)%5;
        if(hasil == 0){
           System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
    }
}
