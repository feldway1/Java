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
public class Bai15_tinhtiendien {
    public static void main(String[] args) {
        System.out.println("Tinh tien dien");
        Scanner sc =new Scanner(System.in);
        double chisocu, chisomoi, thanhtien,tieuthu,bac1=0,bac2=0,bac3=0,bac4=0,bac5=0,bac6=0;
        System.out.print("Nhap chi so cu(kWh): ");
        chisocu = sc.nextDouble();
        System.out.print("Nhap chi so moi(kWh): ");
        chisomoi = sc.nextDouble();
        tieuthu = chisomoi - chisocu;
        
        while(tieuthu > 0) {
            if(tieuthu-50>0)
            {
                bac1=50;
                tieuthu -= 50;
            } else {  bac1 = tieuthu; break;}

            if(tieuthu-100>0)
            {
                bac2=100;
                tieuthu -= 100;
            } else {  bac2 = tieuthu; break;}

            if(tieuthu-100>0)
            {
                bac3=100;
                tieuthu -= 100;
            } else {  bac3 = tieuthu; break;}
            if(tieuthu-100>0)
            {
                bac4=100;
                tieuthu -= 100;
            } else {  bac4 = tieuthu; break;}
            if(tieuthu-100>0)
            {
                bac5=100;
                tieuthu -= 100;
            } else {  bac5 = tieuthu; break;}
            if(tieuthu>400)
            {
                bac6=tieuthu-bac5;
            }
        }

        System.out.printf("Bac 1 %.2f (VND)\n",bac1);
        System.out.printf("Bac 2 %.2f (VND)\n",bac2);
        System.out.printf("Bac 3 %.2f (VND)\n",bac3);
        System.out.printf("Bac 4 %.2f (VND)\n",bac4);
        System.out.printf("Bac 5 %.2f (VND)\n",bac5);
        System.out.printf("Bac 6 %.2f (VND)\n",bac6);

        thanhtien = bac1 * 1086 + bac2 * 1866 + bac3 * 2167+ bac4 * 2729 + bac5 * 3050 + bac6 * 3151;
        
        
        System.out.printf("So tien dien phai tra la %.2f (VND)\n",thanhtien);
    }
}
