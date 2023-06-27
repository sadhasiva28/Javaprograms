package mypack;

public class Salary {
    private double basic;
    private double da;
    private double pf;
    private double gross;
    private double net;
    
    public Salary(double basic, double da, double pf) {
        this.basic = basic;
        this.da = da;
        this.pf = pf;
        calculateGross();
        calculateNet();
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }
    private void calculateGross() {
        gross = basic + da;
    }

    private void calculateNet() {
        net = gross - pf;
    }

    @Override
    public String toString() {
        return "Salary [basic=" + basic + ", da=" + da + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
    }
}
