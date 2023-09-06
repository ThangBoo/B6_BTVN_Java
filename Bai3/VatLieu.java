package Bai3;

import java.util.Scanner;

public class VatLieu {
    private String ten;
    private String mauSac;
    private int doCung;

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public VatLieu() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên vật liệu: ");
        this.ten = sc.nextLine();
        System.out.println("Nhập màu sắc:  ");
        this.mauSac = sc.nextLine();
        System.out.println("Nhập độ cứng");
        this.doCung = sc.nextInt();
    }

    public void xuat() {
        System.out.printf("%-15s%-15s%-10d", ten, mauSac, doCung);
    }
}
