/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nhanviencuahang;

import java.util.List;

/**
 *
 * @author User
 */
public interface QuanLiKhachHang_Interface {
    List<QuanLiKhachHang> getAll();
    
    String them(QuanLiKhachHang qlkh);
    
    String xoa(int index);
    
    String capnhat(int index, QuanLiKhachHang qlkh);
    
    void sapXepTen(List<QuanLiKhachHang> list);
    
    List<QuanLiKhachHang> timTen(String ten);
}
