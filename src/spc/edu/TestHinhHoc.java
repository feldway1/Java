/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class TestHinhHoc {
    public static void main(String[] args) {
        HinhHoc h;
        h = new HinhChuNhat(4,5);
        System.out.println("chu vi = "+ h.tinhChuVi());
        System.out.println("Dien tich = "+ h.tinhDienTich());
        System.out.println("---------");
        h = new HinhVuong(5);
        System.out.println("Chu vi = "+h.tinhChuVi());
        System.out.println("dien tich = "+ h.tinhDienTich());
        HinhChuNhat hcn = new HinhVuong(5);
        System.out.println("---------");
        System.out.println("Chu vi = " + hcn.tinhChuVi());
        System.out.println("Dien tich = "+hcn.tinhDienTich());
    }
}
