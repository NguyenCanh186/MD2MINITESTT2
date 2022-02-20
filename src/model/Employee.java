package model;

import java.util.Scanner;

public abstract class Employee {
    private String id;
    private String fullName;
    private int age;
    private int phoneNumber;
    private String email;
    Scanner scanner = new Scanner(System.in);

    public Employee() {
    }

    public Employee(String id, String fullName, int age, int phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public abstract double getNetSalary();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void input(){
        System.out.println("Nhap ma nhan vien: " );
        id = scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        fullName = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.println("Nhap so dien thoai: ");
        phoneNumber = scanner.nextInt();
        System.out.println("Nhap email: ");
        email = scanner.nextLine();
    }
    public String toString(){
        return "Mã nhân viên: " + this.id
                + ", họ và tên "
                + this.fullName
                + ", tuổi: "
                + this.age
                + ", số điện thoại: "
                + this.phoneNumber;
    }
}
