
public class Finance {

    private double costSalaryEmployee;
    private double costAdvertisment;
    private double Sales;

    public Finance(double costSalaryEmployee, double costAdvertisment, double Sales) {
        this.costSalaryEmployee = costSalaryEmployee;
        this.costAdvertisment = costAdvertisment;
        this.Sales = Sales;

    }

    public double getCostSalaryEmployee() {
        return costSalaryEmployee;
    }

    public void setCostSalaryEmployee(double costSalaryEmployee) {
        this.costSalaryEmployee = costSalaryEmployee;
    }

    public double getCostAdvertisment() {
        return costAdvertisment;
    }

    public void setCostAdvertisment(double costAdvertisment) {
        this.costAdvertisment = costAdvertisment;
    }

    public double totalCost(double costSalaryEmployee, double costAdvertisment) {
        return costSalaryEmployee + costAdvertisment;

    }

    public double getSales() {
        return Sales;
    }

    public void setSales(double Sales) {
        this.Sales = Sales;
    }

}
