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
import java.math.BigInteger;

public class soal6 {
     public static void main(String[] args){
     Scanner masukan = new Scanner(System.in);
        
        String A = masukan.nextLine();
        String B = masukan.nextLine();
        
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
}    
}
