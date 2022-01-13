package com.codegym;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    private double soNgayTro;
    private String loaiPhongTro;
    private double giaPhong;

    public KhachTro() {
    }

    public KhachTro(double soNgayTro, String loaiPhongTro, double giaPhong) {
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
    }

    public KhachTro(String name, String ngaySinh, String CMT, double soNgayTro, String loaiPhongTro, double giaPhong) {
        super(name, ngaySinh, CMT);
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số ngày trọ: ");
        this.soNgayTro = sc.nextDouble();
        sc.nextLine();
        System.out.println(" Nhập loại phòng trọ: ");
        this.loaiPhongTro = sc.nextLine();
        System.out.println("Nhập giá phòng: ");
        this.giaPhong = sc.nextDouble();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Số ngày trọ: " + this.soNgayTro
                + "\n" + "Loại phòng trọ: " + this.loaiPhongTro
                + "\n" + "Giá phòng: " + this.giaPhong);
    }

    public double getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(double soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

}
