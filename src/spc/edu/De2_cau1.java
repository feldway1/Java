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
public class De2_cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci");
        System.out.print("Nhap so luong day so Fibonacci: ");
        int soluong = sc.nextInt();
        
        int [] fibonacciArray = new int[soluong];
        
        if(soluong>0) fibonacciArray[0]=1;
        if(soluong>1) fibonacciArray[1]=1;
        
        for(int i =2; i<soluong;i++)
        {
            fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
        }
        int sum = 0;
        System.out.print("Day so Fibonacci: ");
        for(int i =0;i<soluong;i++)
        {
            System.out.print(fibonacciArray[i]+" ");
            sum +=fibonacciArray[i];
        }
        System.out.println("\nTong cua day so Fibonacci: "+sum);
    }
}
