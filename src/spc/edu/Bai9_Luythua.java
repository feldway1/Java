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
public class Bai9_Luythua {
    public static void main(String[] args) {
        System.out.println("Luy thua");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap co so: ");
        int coso = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int somu = sc.nextInt();
        System.out.println(coso + "^"+ somu +" = "+ Math.pow(coso, somu));
    }
}
