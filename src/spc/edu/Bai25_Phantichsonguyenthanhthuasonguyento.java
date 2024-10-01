/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai25_Phantichsonguyenthanhthuasonguyento {
    public static void phanTich(int n)
    {
        int i = 2;
        while(n>1)
        {
            if(checkSNT(i))
            {
                if(n%i==0)
                {
                    System.out.print(i+".");
                    n/=i;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
