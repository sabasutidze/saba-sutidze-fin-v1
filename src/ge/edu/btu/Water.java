package ge.edu.btu;

public class Water {
    private String customerNumber;
    double amount;

    Water() {
    }

    Water(String customerNumber, double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        String a = String.format("Water(customerNumber='%s', amount=%f)", this.customerNumber, this.amount);
        return a;
    }
}