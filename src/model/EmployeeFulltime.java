package model;

public class EmployeeFulltime extends Employee{
    private double bonus;
    private double fineMoney;
    private double basicSalary;

    public EmployeeFulltime() {
    }

    public EmployeeFulltime(double bonus, double fineMoney, double basicSalary) {
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.basicSalary = basicSalary;
    }

    public EmployeeFulltime(String id, String fullName, int age, int phoneNumber, String email, double bonus, double fineMoney, double basicSalary) {
        super(id, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(double fineMoney) {
        this.fineMoney = fineMoney;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getNetSalary() {
        return getBasicSalary() + (getBonus() - getFineMoney());
    }

    public void input(){
        super.input();
        System.out.println("nhap so tien thuong: ");
        bonus = scanner.nextDouble();
        System.out.println("nhap so tien phat: ");
        fineMoney = scanner.nextDouble();
        System.out.println("nhap luong co ban: ");
        basicSalary = scanner.nextDouble();
    }
    public String toString(){
        return super.toString() + ", so tien thuc linh la: "
                + getNetSalary()
                + " dong";
    }
}
