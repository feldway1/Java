/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import  java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai12_canchi {
    public static void main(String[] args) {
        System.out.println("Tinh can chi");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam can tinh can chi: ");
        int nam = sc.nextInt();
        String can = TinhCan(nam);
        String chi = TinhChi(nam);
        System.out.println("Nam " + nam + " la: "+ can +" "+ chi);
        
    }
    static String TinhCan(int nam)
    {
        String[] canArray = {"Canh","Tan","Nham","Quy","Giap","At","Binh","Dinh","Mau","Ky"};
        return canArray[nam%10];
    }
    static String TinhChi (int nam)
    {
        String[] chiArray = {"Than","Dau","Tuat","Hoi","Ty","Suu","Dan","Meo","Thin","Ty","Ngo","Mui"};
        return chiArray [nam%12];
    }
}
