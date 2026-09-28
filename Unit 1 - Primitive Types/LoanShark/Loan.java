public class Loan {
    
    double principal;
    double rate;
    double time;
    int number;

    public Loan(double p, double r, double t, int n) {
        this.principal = p;
        this.rate = r;
        this.time = t;
        this.number = n;
    }

    public double calculateSimpleInterest() {
        return principal + principal * rate/100 * time;
    }

    public double calculateTotalRepayment() {
        return principal * Math.pow(1 + rate/100/number, number * time);
    }
}
