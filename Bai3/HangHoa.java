package Bai3;

import java.util.Scanner;

public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuong;
    protected float donGia;
    protected VatLieu dsVL;

    public HangHoa(String maHang, String tenHang, int soLuong, float donGia, VatLieu dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
    }

    public HangHoa() {
        this.dsVL = new VatLieu();
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public VatLieu getDsVL() {
        return dsVL;
    }

    public void setDsVL(VatLieu dsVL) {
        this.dsVL = dsVL;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        this.maHang = sc.nextLine();
        System.out.println("Nhập tên hàng: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        this.soLuong = sc.nextInt();
        System.out.println("Nhập đơn giá: ");
        this.donGia = sc.nextFloat();
        dsVL.nhap();
    }

    public float tongTien() {
        return this.donGia * this.soLuong;
    }

    public void output() {
        System.out.printf("%-10s%-10s%-10d%-10.2f%-10.2f", maHang, tenHang, soLuong, donGia, tongTien());
        dsVL.xuat();
    }


}
