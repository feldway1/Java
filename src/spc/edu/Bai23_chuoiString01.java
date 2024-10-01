/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai23_chuoiString01 {
    public static void main(String[] args) {
        System.out.println("Xuat thong tin");
        String fullname = "Nguyen Thi Hong Dao";
        System.out.println(fullname);
        System.out.println("Ho: "+fullname.substring(0,6));
        System.out.println("Chu lot: "+ fullname.substring(7,16));
        System.out.println("Ten: "+fullname.substring(16,19));
        System.out.println("Chu Hoa: " + fullname.toUpperCase());
    }
}
