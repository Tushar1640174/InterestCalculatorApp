import java.util.*;

public class SIP {


    private double monthlyInvestment;
    private double rate;
    private double timePeriod;

    
    public double getMonthlyInvestment() {
        return monthlyInvestment;
    }
    public void setMonthlyInvestment(double monthlyInvestment) {
        this.monthlyInvestment = monthlyInvestment;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getTimePeriod() {
        return timePeriod;
    }
    public void setTimePeriod(double timePeriod) {
        this.timePeriod = timePeriod;
    }
    public SIP(double monthlyInvestment, double rate, double timePeriod) {
        this.monthlyInvestment = monthlyInvestment;
        this.rate = rate;
        this.timePeriod = timePeriod;
    }
    public SIP() {
    }

    public void calculate(Scanner sc)
    {
        double amount=0;
        
        
        System.out.println("Enter monthly Investment:");
        double p=sc.nextDouble();
        monthlyInvestment=p;

        System.out.println("Enter Expected rate of return(P.A):");
        double r=sc.nextDouble();
        rate=r;

        System.out.println("Time period(in years)");
        double t=sc.nextDouble();
        timePeriod=t;
        int n=(int)(t*12);
        double i=r/1200;


        amount=p*((Math.pow((1+i),n))-1)*(1+i)/i;


            System.out.println("______________________");
            System.out.println();
            System.out.println("Invested Amount: "+(int)(p*timePeriod*12));
            System.out.println("Est. Returns: "+(int)((amount-(p*timePeriod*12))));
            System.out.println("Total Value: "+(int)amount);   

        

    }
    
}
