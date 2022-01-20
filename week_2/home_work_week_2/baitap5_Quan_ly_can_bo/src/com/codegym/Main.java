package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HRM hrm = new HRM();
        System.out.println("---QUẢN LÝ CÁN BỘ---");
        System.out.println("1.Thêm cán bộ vào danh sách.");
        System.out.println("2. Xóa cán bộ khỏi danh sách.");
        System.out.println("3, Tìm kiếm thông tin cán bộ theo tên.");
        System.out.println("4. Hiển thị danh sách quản lý.");
        System.out.println("0. Thoát chương trình.");
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("---Thêm cán bộ vào danh sách---");
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày tháng năm sinh: ");
                    String strDateOfBirth = sc.nextLine();
                    Date dateOfBirth = strToDate(strDateOfBirth);
                    System.out.println("Nhập giới tính: ");
                    String sex = sc.nextLine();
                    System.out.println("Nhập địa chỉ:");
                    String adress = sc.nextLine();
                    System.out.println("Cán bộ bạn cần nhập là: (1.Kĩ sư; 2.Công nhân; 3.Nhân viên)");
                    int choice2 = sc.nextInt();
                    Cadres cadres = new Cadres();
                    switch (choice2) {
                        case 1:
                            System.out.println("Nhập ngành đào tạo cần quản lý: ");
                            String trainingIndustry = sc.nextLine();
                            cadres = new Engineer(name, dateOfBirth, sex, adress, trainingIndustry);
                            break;
                        case 2:
                            System.out.println("Nhập bậc nghề: ");
                            String tier = sc.nextLine();
                            cadres = new Worker(name, dateOfBirth, sex, adress, tier);
                            break;
                        case 3:
                            System.out.println("Nhập công viêc: ");
                            String work = sc.nextLine();
                            cadres = new Staff(name, dateOfBirth, sex, adress, work);
                        default:
                            System.exit(0);
                            break;
                    }
                    hrm.addCadres(cadres);
                    break;
                }
            }
        } while (choice >= 0 && choice < 5);

    }

    public static Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày tháng!");
        }
        return date;
    }
}
