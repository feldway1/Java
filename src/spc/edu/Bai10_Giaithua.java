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
public class Bai10_Giaithua {
    public static void main(String[] args) {
        System.out.println("Giai thua");
        Scanner sc = new Scanner(System.in);
        int i = 1, sonhap, giaithua = 1;
        System.out.println("Nhap so can tinh giai thua: ");
        
        sonhap = sc.nextInt();
        while(i<=sonhap)
        {
            giaithua = giaithua * i;
            i++;
        }
        System.out.println("Giai thua cua " + sonhap + " la: " + giaithua);
    }
}
