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
public class Bai8_giaiptb2 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2");
        Scanner sc = new Scanner(System.in);
        double a, b ,c, delta, x1, x2;
        System.out.print("Nhap a:");
        a = sc.nextDouble();
        System.out.print("Nhap b:");
        b = sc.nextDouble();
        System.out.print("Nhap c:");
        c = sc.nextDouble();
        if (a==0)
        {
            if(b==0)
            {
                if(c!=0)
                {
                    System.out.println("Phuong trinh vo nghiem");
                }
                else
                {
                    System.out.println("Phuong trinh vo so nghiem");
                }
            }
            else 
            {
                System.out.println("Phuong trinh co nghiem x = "+ (-c/b));
            }
        }
        else
        {
            delta = b*b -4*a*c;
            if(delta <0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (delta == 0)
            {
                System.out.println("Phuong trinh co nghiem x1 = x2 = "+(-b/(2*a)));                         
            }
            else
            {
                x1=(-b + Math.sqrt(delta))/(2*a);
                x2=(-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1+" va x2 = "+x2);
            }
        }
    }
}
