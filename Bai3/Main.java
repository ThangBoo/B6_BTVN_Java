package Bai3;

import Bai2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<HangHoaDienTu> hangHoaDienTus = new ArrayList<>();
        ArrayList<HangHoaGiaDung> hangHoaGiaDungs = new ArrayList<>();
        System.out.println("Nhập số lượng hàng điện tử và hàng hóa dân dụng: ");
        int n, m;
        do {
            n = sc.nextInt();
            m = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhập lại n: ");
            }
            if (m < 0) {
                System.out.println("Nhập lại m: ");
            }
        } while (n < 0 | m < 0);
        inputHangDienTu(hangHoaDienTus, n);
        inputHangGiaDung(hangHoaGiaDungs, m);

        outputHangDienTu(hangHoaDienTus);
        System.out.println("\n");
        outputHangGiaDung(hangHoaGiaDungs);


    }

    public static void inputHangDienTu(ArrayList<HangHoaDienTu> hangHoaDienTus, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hàng điện tử " + (i + 1) + ":");
            HangHoaDienTu hangHoaDienTu = new HangHoaDienTu();
            hangHoaDienTu.input();
            hangHoaDienTus.add(hangHoaDienTu);
        }
    }

    public static void outputHangDienTu(ArrayList<HangHoaDienTu> hangHoaDienTus) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s %-15s %-10s%-10s%-10s\n", "Mã hàng", "Tên hàng", "Số lượng", "Đơn giá", "Tổng tiền", "Tên Vật liệu", "Màu sắc", "Độ cứng", "Bảo hành", "Công suất");
        for (HangHoaDienTu hangHoaDienTu : hangHoaDienTus) {
            hangHoaDienTu.output();
        }

    }

    public static void inputHangGiaDung(ArrayList<HangHoaGiaDung> hangHoaGiaDungs, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hàng gia dụng " + (i + 1) + ":");
            HangHoaGiaDung hangHoaGiaDung = new HangHoaGiaDung();
            hangHoaGiaDung.input();
            hangHoaGiaDungs.add(hangHoaGiaDung);
        }
    }

    public static void outputHangGiaDung(ArrayList<HangHoaGiaDung> hangHoaGiaDungs) {
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-15s %-15s %-10s%-10s\n", "Mã hàng", "Tên hàng", "Số lượng", "Đơn giá", "Tổng tiền", "Tên Vật liệu", "Màu sắc", "Độ cứng", "Chức năng");
        for (HangHoaGiaDung hangHoaGiaDung : hangHoaGiaDungs) {
            hangHoaGiaDung.output();
        }

    }
}
