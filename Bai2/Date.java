package Bai2;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        this.day = sc.nextInt();
        System.out.println("Enter month: ");
        this.month = sc.nextInt();
        System.out.println("Enter year: ");
        this.year = sc.nextInt();
    }

    public void output() {
        System.out.printf("%d/%d/%d", day, month, year);
    }
}
