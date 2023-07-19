/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanviencuahang;

/**
 *
 * @author User
 */
public class QuanLiKhachHang {
    String tenKH;
    String maKH;
    String diaChi;
    int SDT;

    public QuanLiKhachHang() {
    }

    public QuanLiKhachHang(String tenKH, String maKH, String diaChi, int SDT) {
        this.tenKH = tenKH;
        this.maKH = maKH;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    
    Object[] toDATAROW(){
        return new Object[]{this.tenKH, this.maKH, this.diaChi, this.SDT};
    }
}
