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
public class Bai24_tongcacchusocuasobguyento {
    public static int nhap()
    {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while(!check)
        {
            System.out.print(" ");
            try
            {
                n = sc.nextInt();
                check = true;
            }
            catch(Exception e)
            {
                System.out.println("Ban phai nhap so! Hay nhap lai...");
                sc.nextLine();
            }
        }
        return(n);
    }
    public static int tinhTong(long i)
    {
        int sum = 0;
        long n;
        while(i!=0)
        {
            n = i%10;
            sum+=n;
            i/=10;
        }
        return(sum);
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap a: ");
        int n = nhap();
        System.out.println("Tong cau so "+n+" = "+tinhTong(n));
    }
    
}
