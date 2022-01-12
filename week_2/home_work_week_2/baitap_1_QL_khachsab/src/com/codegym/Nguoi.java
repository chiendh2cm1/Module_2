package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String name;
    private Date ngaySinh;
    private String CMT;

    public Nguoi() {
    }

    public Nguoi(String name, Date ngaySinh, String CMT) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.CMT = CMT;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin Người trọ: ");
        System.out.println(" nhập tên: ");
        this.name = sc.nextLine();
        System.out.println(" Nhập ngày sinh(dd-mm-yy): ");
        String ns = sc.nextLine();
        this.ngaySinh = chuyenStringDate(ns);
        System.out.println("Nhập chứng minh nhân dân: ");
        this.CMT = sc.nextLine();
    }

    public Date chuyenStringDate(String str) {
        Date ns = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            ns = sdf.parse(str);
        } catch (Exception e) {
            System.out.println("Loi dinh dang ngay thang.!");
        }
        return ns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
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