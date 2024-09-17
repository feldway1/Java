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
public class Bai14_laivay {
    public static void main(String[] args) {
        System.out.println("Tinh tien lai va von");
        Scanner sc = new Scanner(System.in);
        double T;
        System.out.print("Nhap tien gui(trieu dong): ");
        T = sc.nextFloat();
        for(int year = 1;year<=10;year++)
        {
            double von = T * Math.pow(1 + 0.08, year);
            double lai = T * 0.08 * year;
            System.out.printf("Nam: %d\tTien von: %.2f trieu dong\tTien lai: %.2f trieu dong%n",year,von,lai);
        }
    }
}
