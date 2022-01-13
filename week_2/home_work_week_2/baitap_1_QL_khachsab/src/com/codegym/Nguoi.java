package com.codegym;

import java.util.Scanner;

public class Nguoi {
    private String name;
    private String ngaySinh;
    private String CMT;

    public Nguoi() {
    }

    public Nguoi(String name, String ngaySinh, String CMT) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.CMT = CMT;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập tên: ");
        this.name = sc.nextLine();
        System.out.println(" Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhập chứng minh nhân dân: ");
        this.CMT = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public void hienThongTin() {
        System.out.println("Họ Tên: " + this.name
                + "\n" + "Ngày sinh: " + this.ngaySinh
                + "\n" + "CMT: " + this.CMT);
    }
}