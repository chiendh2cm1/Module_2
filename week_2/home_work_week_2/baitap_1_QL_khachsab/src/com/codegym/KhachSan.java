package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> khachTros = new ArrayList<>();

    public KhachSan() {
    }

    public ArrayList<KhachTro> getKhachTros() {
        return khachTros;
    }

    public void setKhachTros(ArrayList<KhachTro> khachTros) {
        this.khachTros = khachTros;
    }

    public void themKhachTro(KhachTro khachTro) {
        khachTros.add(khachTro);
    }

    public void xoaKhachTro(KhachTro khachTro) {
        int count = 0;
        for (KhachTro khachTro1 : khachTros) {
            if (khachTro.getName().equalsIgnoreCase(khachTro1.getName())) {
                khachTros.remove(khachTro1);
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println(" Không có tên khách trọ cần xóa");
    }

    public void hienThiDanhSach() {
        for (KhachTro khachTro : khachTros) {
            khachTro.hienThongTin();
        }
    }

    public double tinhTien(String CMT) {
        double tienThueTro = 0;
        for (int i = 0; i < khachTros.size(); i++) {
            if (khachTros.get(i).getCMT().equals(CMT)) {
                tienThueTro = khachTros.get(i).getSoNgayTro() * khachTros.get(i).getGiaPhong();
            }
        }
        return tienThueTro;

    }
}
