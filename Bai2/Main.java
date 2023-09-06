package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Nhập số lượng sinh viên: ");
        int n;
        do {
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhập lại n: ");
            }
        } while (n < 0);
        input(students, n);
        output(students);
    }

    public static void input(ArrayList<Student> students, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.input();
            students.add(student);
        }
    }

    public static void output(ArrayList<Student> students) {
        System.out.printf("%-15s %-10s %-15s %-15s %-15s %-10s %-15s\n", "Họ tên", "Tuổi", "Địa chỉ", "Ngày sinh", "Mã sinh viên", "Lớp", "Trường");
        for (Student student : students) {
            student.output();
        }

    }


}
