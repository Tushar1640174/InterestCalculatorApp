

import java.util.*;

public class Lumpsum {


    private double totalInvestment;
    private double rate;
    private double time;


    public double getTotalInvestment() {
        return totalInvestment;
    }
    public void setTotalInvestment(double totalInvestment) {
        this.totalInvestment = totalInvestment;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }




    public void calculate(Scanner sc)
    {
        System.out.println("Enter total Investment:");
        double p=sc.nextDouble();
        totalInvestment=p;
        System.out.println("Enter Expected rate of return(P.A):");
        double r=sc.nextDouble();
        rate=r;
        System.out.println("Time period(in years)");
        double t=sc.nextDouble();
        time=t;

        int amount=(int)(p*(Math.pow((1+r/100), t)));
        System.out.println("______________________");

       System.out.println("Invested Amount: "+p);
       System.out.println("Est. Returns: "+(amount-(int)p));
       System.out.println("Total Value: "+amount);
    }
    
}
