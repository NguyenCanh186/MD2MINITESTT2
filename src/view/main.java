package view;

import model.Employee;
import model.EmployeeFulltime;
import model.EmployeeParttime;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập số nhân viên muốn thêm.
        System.out.println("nhap so nhan vien trong cong ty: ");
        int employeeNumber = scanner.nextInt();
        Employee[] employee = new Employee[employeeNumber];

        System.out.println("nhap thong tin cua ban: ");
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
        double tbSalary;
        // tính tổng số lương phải trả cho nhân viên
        for (int i = 0; i < employeeNumber; i++) {
            sumSalary += employee[i].getNetSalary();
        }
        tbSalary = sumSalary/employeeNumber;
        System.out.println("so luong phai tra cho nhan vien la: " + sumSalary);

    }
}

