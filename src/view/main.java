package view;

import model.Employee;
import model.EmployeeFulltime;
import model.EmployeeParttime;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Menu: ");
//        System.out.println("1. Nhân viên fulltime. ");
//        System.out.println("2. Nhân viên Parttime. ");
//        System.out.println(" Nhập lựa chọn của bạn: ");
//        int choose = scanner.nextInt();
//        ArrayList<Employee> employees = new ArrayList<>();
//        switch (choose){
//            case 1:
//                System.out.println("Nhập mã nhân viên: " );
//                String id = scanner.nextLine();
//                System.out.println("Nhập họ tên: ");
//                String fullName = scanner.nextLine();
//                System.out.println("Nhập tuổi: ");
//                int age = scanner.nextInt();
//                System.out.println("Nhập số điện thoại: ");
//                int phoneNumber = scanner.nextInt();
//                System.out.println("Nhập địa chỉ email: ");
//                String email = scanner.nextLine();
//                System.out.println("Nhập số tiền thưởng: ");
//                double bonus = scanner.nextDouble();
//                System.out.println("Nhập số tiền phạt: ");
//                double fineMoney = scanner.nextDouble();
//                System.out.println("Nhập lương cơ bản: ");
//                double basicSalary = scanner.nextDouble();
//                employees.add(new EmployeeFulltime(id, fullName, age, phoneNumber, email, bonus, fineMoney, basicSalary));
//                System.out.println("Thông tin: ");
//                System.out.println(employees.toString());
//                break;
//            case 2:
//                employees.add(new EmployeeParttime());
//                System.out.println("Nhập mã nhân viên: " );
//                String id1 = scanner.nextLine();
//                System.out.println("Nhập họ tên: ");
//                String fullName1 = scanner.nextLine();
//                System.out.println("Nhập tuổi: ");
//                int age1 = scanner.nextInt();
//                System.out.println("Nhập số điện thoại: ");
//                int phoneNumber1 = scanner.nextInt();
//                System.out.println("Nhập địa chỉ email: ");
//                String email1 = scanner.nextLine();
//                System.out.println("Nhập số giờ làm thêm của bạn: ");
//                double workHour = scanner.nextDouble();
//                employees.add(new EmployeeParttime(id1, fullName1, age1, phoneNumber1, email1, workHour));
//                System.out.println("Thông tin: ");
//                System.out.println(employees.toString());
//                break;
//        }
        Scanner scanner = new Scanner(System.in);
        // nhập số nhân viên muốn thêm.
        System.out.println("nhap so nhan vien trong cong ty: ");
        int employeeNumber = scanner.nextInt();
        Employee[] employee = new Employee[employeeNumber];

        System.out.println("nhap thong tin cua nhan vien: ");
        for (int i = 0; i < employeeNumber; i++) {
            System.out.println("chon 1 neu ban la nhan vien fulltime " +
                    "chon 2 neu ban la nhan vien parttime");
            int choose = scanner.nextInt();
            if(choose == 1){
                employee[i] = new EmployeeFulltime();
            } else if (choose == 2) {
                employee[i] = new EmployeeParttime();
            }
            employee[i].input();
        }
        System.out.println("thong tin nhan vien: ");
        // hiển thị thông tin nhân viên
        for (int i = 0; i < employeeNumber; i++) {
            System.out.println(employee[i].toString());
        }
        double sumSalary = 0;
        double avarageSalary;
        int count = 0;
        double ParttimeSalary = 0;
        // tính tổng số lương phải trả cho nhân viên
        for (int i = 0; i < employeeNumber; i++) {
            sumSalary += employee[i].getNetSalary();
        }
        avarageSalary = sumSalary/employeeNumber;
        System.out.println("so luong phai tra cho nhan vien la: " + sumSalary);
        for (int i = 0; i < employeeNumber; i++) {
            if(employee[i].getNetSalary()<avarageSalary){
                count++;
            }
            if(employee[i] instanceof EmployeeParttime){
                ParttimeSalary += employee[i].getNetSalary();
            }
        }
        System.out.println("nhan vien co so luong thap hon muc trung binh la: " + count);
        System.out.println("so luong phai tra cho nhan vien ban thoi gian la: " + ParttimeSalary);

    }
}

