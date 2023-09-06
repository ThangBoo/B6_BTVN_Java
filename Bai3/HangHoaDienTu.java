package Bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public HangHoaDienTu(String maHang, String tenHang, int soLuong, float donGia, VatLieu dsVL, int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public HangHoaDienTu() {
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Thời gian bảo hành: ");
        this.thoiGianBaoHanh = sc.nextInt();
        System.out.println("Công suất: ");
        this.congSuat = sc.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-10d%-10d", thoiGianBaoHanh, congSuat);
    }


}
