package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        // Hiển thị
        System.out.print(" Nhập số lượng sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Product[] productsLish = new Product[n];
        for (int i = 0; i < productsLish.length; i++) {
            productsLish[i] = new Product();
            System.out.println("nhập sản phẩm thứ " + (i + 1));
            productsLish[i].input();
        }
        System.out.println("Danh sách sản phẩm: ");
        System.out.printf("\n%-5s %-20s %-20s %-20s", "id", "name", "price", "description");
        for (int i = 0; i < productsLish.length; i++) {
            productsLish[i].display();
        }
        //        ---Thêm đối tượng vào mảng---
        System.out.println("\nNhập sản phẩm cần thêm");
        Product productNew =  new Product();
        productNew.input();
        System.out.print("\nNhập vị trí cần thêm: ");
        int indexNew = sc.nextInt();
        if (indexNew <-1 || indexNew>n){
            System.out.println(" không thêm được sản phẩm");
        }else {
            productsLish = insertObj(productsLish, productNew, indexNew);
            capNhap(productsLish);//cập nhật mảng.
        }
        // Xóa đối tượng khỏi mảng.
        String spXoa;
        System.out.println("\nNhập tên sản phẩm cần xóa: ");
        Product productDel =new Product();
        sc.nextLine();
        spXoa = sc.nextLine();
        productDel.setName(spXoa);
        int indexDel = searchObj(productsLish, productDel);
        if (indexDel ==-1){
            System.out.println("Không có sản phẩm trong mảng");
        }else {
            productsLish = deleteObj(productsLish, indexDel);
            capNhap(productsLish);
        }

    }

    public static Product[] insertObj(Product[] arr, Product x, int index) {
        Product[] newProdutsLish = new Product[arr.length + 1];
        for (int i = 0; i < newProdutsLish.length; i++) {
            if (i < index) {
                newProdutsLish[i] = arr[i];
            } else if (i == index) {
                newProdutsLish[index] = x;
            } else {
                newProdutsLish[i] = arr[i - 1];
            }
        }
        return newProdutsLish;
    }

    public static int searchObj(Product arr[], Product x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(x.getName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static Product[] deleteObj(Product arr[], int index) {
        Product[] newProdutsLish = new Product[arr.length - 1];
        for (int i = 0; i < newProdutsLish.length; i++) {
            if (i < index) {
                newProdutsLish[i] = arr[i];
            } else {
                newProdutsLish[i] = arr[i + 1];
            }
        }
        return newProdutsLish;
    }


    public static void capNhap(Product arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
    }
}
