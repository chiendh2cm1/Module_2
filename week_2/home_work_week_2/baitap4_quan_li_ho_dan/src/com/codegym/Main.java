package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TownManagement townManagement = new TownManagement();
        System.out.println("---Chương trình quản lý hộ dân trong khu phố: ");
        System.out.println("1. Hiển thị thông tin các hộ dân trong khu phố.");
        System.out.println("2. Nhập thông tin các hộ dân trong khu phố.");
        System.out.println("3. Thêm 1 hộ dân.");
        System.out.println("4. Xóa 1 hộ dân.");
        System.out.println("5. Cập nhập  lại 1 hộ dân.");
        System.out.println("6.Tìm kiếm 1 hộ dân trong khu phố");
        System.out.println("7. Hiển thị thông tin các hộ có người mừng thọ.");
        System.out.println("");
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("1.Hiển thị thông tin các hộ có người mừng thọ.");
                    townManagement.displayHouseHolds();
                    break;
                }
                case 2: {
                    System.out.println("2. Nhập thông tin các hộ dân trong khu phố");
                    inputHouseHolds(townManagement);
                    break;
                }
            }
        } while (choice >= 0 && choice < 8);
    }

    private static void inputHouseHolds(TownManagement townManagement) {
        System.out.println(" Nhập số lượng hộ dân: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Hộ dân thứ: " + (i + 1) + " : ");
            HouseHold houseHold = new HouseHold();
            houseHold.inputHouseHold(sc);
            townManagement.addHouseHold(houseHold);
        }
    }
}
