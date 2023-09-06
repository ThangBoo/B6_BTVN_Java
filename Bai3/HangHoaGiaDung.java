package Bai3;

import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa {
    private String chucNang;

    public HangHoaGiaDung() {
    }

    public HangHoaGiaDung(String maHang, String tenHang, int soLuong, float donGia, VatLieu dsVL, String chucNang) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chức năng hàng hóa: ");
        this.chucNang = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-15s", chucNang);

    }
}
