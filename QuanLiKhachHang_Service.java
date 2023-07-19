/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanviencuahang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author User
 */
public class QuanLiKhachHang_Service implements QuanLiKhachHang_Interface {

    List<QuanLiKhachHang> listQ = new ArrayList<>();

    public QuanLiKhachHang_Service() {
        listQ.add(new QuanLiKhachHang("khach001", "kh001", "Ha Noi", 12345));
        listQ.add(new QuanLiKhachHang("khach002", "kh002", "Ha Nam", 22346));
        listQ.add(new QuanLiKhachHang("khach003", "kh003", "Hai Phong", 334566));
        listQ.add(new QuanLiKhachHang("khach004", "kh004", "Nghe An", 432333));
        listQ.add(new QuanLiKhachHang("khach005", "kh005", "Ha Noi", 522333));
    }

    @Override
    public List<QuanLiKhachHang> getAll() {
        return listQ;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String them(QuanLiKhachHang qlkh) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (qlkh != null) {
            listQ.add(qlkh);
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    @Override
    public String xoa(int index) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (index >= 0) {
            listQ.remove(index);
            return "xoa thanh cong";
        } else {
            return "xoa that bai";
        }
    }

    @Override
    public String capnhat(int index, QuanLiKhachHang qlkh) {
        if (qlkh != null && index >= 0) {
            listQ.set(index, qlkh);
            return "Cập nhập Thành Công.";
        } else {
            return "Cập nhập thất bại.";
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    public void sapXepDiem(List<SinhVien> list) {
//        Comparator<SinhVien> com1 = new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                if( o1.getDiem()>o2.getDiem()) return 1;
//                else if( o1.getDiem()==o2.getDiem()) return 0;
//                else return -1;
//            }
//        };
//        Collections.sort(list, com1);
//    }
    @Override
    public void sapXepTen(List<QuanLiKhachHang> list) {
        Comparator<QuanLiKhachHang> com1 = new Comparator<QuanLiKhachHang>() {
            @Override
            public int compare(QuanLiKhachHang o1, QuanLiKhachHang o2) {
                return o1.getTenKH().compareTo(o2.getTenKH());
            }
        };
        Collections.sort(list, com1);
    }

    @Override
    public List<QuanLiKhachHang> timTen(String ten) {
        List<QuanLiKhachHang> ListKQ = new ArrayList<>();
        for (QuanLiKhachHang x : listQ) {
            if (x.getTenKH().contains(ten)) {
                ListKQ.add(x);
            }
        }
        return ListKQ;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
