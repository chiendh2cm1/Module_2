package com.codegym;

import java.util.ArrayList;

public class KhachSan {
    private ArrayList<KhachTro> khachTros = new ArrayList<>(10);

    public KhachSan() {
    }

    public void themKhachTro(KhachTro khachTro) {
        khachTros.add(khachTro);
    }

    public void xoaKhachTro(KhachTro khachTro) {
        khachTros.remove(khachTro);
    }

    public void hienThiDanhSach(){
        for (int i = 0; i < khachTros.size(); i++) {
            khachTros.get(i).hienThongTin();
        }
    }
    public double tinhTien(String CMT){
            double tienThueTro = 0;
        for (int i = 0; i < khachTros.size(); i++) {
            if (khachTros.get(i).getCMT().equals(CMT)){
                tienThueTro = khachTros.get(i).getSoNgayTro()* khachTros.get(i).getGiaPhong();
            }
        }
            return  tienThueTro;

    }
}
