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
public class Bai5_Nhapnamsinh {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tuoi");
        System.out.print("Nhap ho va ten: ");
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        System.out.print("Nhap so nam sinh: ");
        int namsinh = sc.nextInt();
        System.out.print("Nhap so nam hien tai: ");
        int namhientai = sc.nextInt();
        int tuoi = namhientai - namsinh;
        System.out.println("Chao ban "+ hoten);
        System.out.println("So tuoi cua ban la: "+ tuoi);
    }
}
