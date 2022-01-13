package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();
        int choice;
        menu();
        do {
            System.out.println("Mời nhập lừa chọn:");
            choice = sc.nextInt();
            switch (choice) {
                case 0: {
                    break;
                }
                case 1: {
                    KhachTro khachTro = new KhachTro();
                    System.out.println("Nhập số lượng khách trọ: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("khách trọ thứ " + (i + 1));
                        khachTro.nhapThongTin();
                        khachSan.themKhachTro(khachTro);
                        sc.nextLine();
                        break;
                    }
                }
                case 2: {
                    System.out.println("---Thêm Khách Trọ---");
                    KhachTro khachTro = new KhachTro();
                    System.out.println("Nhập thông tin khách trọ: ");
                    khachTro.nhapThongTin();
                    khachSan.themKhachTro(khachTro);
                    break;
                }
                case 3: {
                    System.out.println("---Xóa Khách Trọ---");
                    KhachTro khachTro = new KhachTro();
                    sc.nextLine();
                    System.out.println("Nhập tên khách cần xóa: ");
                    String name = sc.nextLine();
                    khachTro.setName(name);
                    khachSan.xoaKhachTro(khachTro);
                    break;
                }
                case 4: {
                    System.out.println("---Tính tiền---");
                    System.out.println("Nhập CMT khách trọ cần thanh toán: ");
                    sc.nextLine();
                    String CMT = sc.nextLine();
                    System.out.println(" Số tền cần thanh toán là: " + khachSan.tinhTien(CMT) + " VND");
                    break;
                }
                case 5: {
                    khachSan.hienThiDanhSach();
                    break;
                }
                default: {
                    System.out.println("Số bạn nhập phải trong khoảng 0 đến 5");
                    break;
                }
            }

        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("---Quản Lý Khách Sạn---");
        System.out.println("1. Nhập số lượng khách trọ.");
        System.out.println("2. Thêm khách trọ.");
        System.out.println("3. Xóa khách trọ.");
        System.out.println("4. Tính tiền khi khách trả phòng.");
        System.out.println("5. Hiển thị danh sách khách trọ");
        System.out.println(" Thoát chương trình.");

    }
}
