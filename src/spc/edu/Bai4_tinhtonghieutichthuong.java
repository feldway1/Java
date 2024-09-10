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
public class Bai4_tinhtonghieutichthuong {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong hieu tich thuong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = sc.nextInt();
        System.out.println("Nhap so b:");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = "+ tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = "+ hieu);
        int tich = a * b;
        System.out.println(a + " * " + b + " = "+ tich);
        double thuong = (double)a/b;
        System.out.println(a + " / " + b + " = " + thuong);
    }
}
