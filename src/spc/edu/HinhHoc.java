/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public abstract class HinhHoc {
    private int dai;
    private int rong;
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    public HinhHoc(int dai,int rong)
    {
        super();
        this.dai = dai;
        this.rong = rong;
    }
    public HinhHoc()
    {
        super();
    }
    public int getDai()
    {
        return dai;
    }
    public void setDai(int dai)
    {
        this.dai = dai;
    }
    public int getRong()
    {
        return rong;
    }
    public void setRong(int rong)
    {
        this.rong = rong;
    }
}
