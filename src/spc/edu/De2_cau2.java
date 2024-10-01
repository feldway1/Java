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
public class De2_cau2 {
    public static void main(String[] args) {
       System.out.println("Hinh cau");
        Scanner sc = new Scanner(System.in);
        double r, S, V;
        System.out.print("Nhap ban kinh: ");
        r = sc.nextDouble();
        V = (4 * Math.PI * r * r * r)/3;
        System.out.println("The tich hinh cau la: "+ V);
        S = 4 * Math.PI * r * r;
        System.out.println("Dien tich hinh cau la: "+S); 
    }
}
