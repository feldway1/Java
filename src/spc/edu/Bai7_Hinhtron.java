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
public class Bai7_Hinhtron {
    public static void main(String[] args) {
        System.out.println("Hinh tron");
        Scanner sc = new Scanner(System.in);
        double r, S, P;
        System.out.print("Nhap ban kinh: ");
        r = sc.nextDouble();
        P = 2*Math.PI*r;
        System.out.println("Chu vi hinh tron la: "+ P);
        S = Math.PI*r*r;
        System.out.println("Dien tich hinh tron la: "+S);
    }
}
