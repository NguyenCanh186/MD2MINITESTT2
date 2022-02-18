package model;

public class EmployeeParttime extends Employee{
    private double workHour;

    public EmployeeParttime() {
    }

    public EmployeeParttime(double workHour) {
        this.workHour = workHour;
    }

    public EmployeeParttime(String id, String fullName, int age, int phoneNumber, String email, double workHour) {
        super(id, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getNetSalary() {
        return workHour * 100000;
    }

    public void input(){
        super.input();
        System.out.println("Nhap so gio lam them cua ban: ");
        workHour = scanner.nextDouble();
    }
    public String toString(){
        return super.toString() + " so tien luong cua ban la: "
                + getNetSalary();
    }
}
