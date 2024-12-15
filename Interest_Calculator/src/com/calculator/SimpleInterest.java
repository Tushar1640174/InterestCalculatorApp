

import java.util.*;

public class SimpleInterest {


    private double principle;
    private double rate;
    private double time;


    public double getPrinciple() {
        return principle;
    }
    public void setPrinciple(double principle) {
        this.principle = principle;
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
        principle=p;
        System.out.println("Enter Expected rate of return(P.A):");
        double r=sc.nextDouble();
        rate=r;
        System.out.println("Time period(in years)");
        double t=sc.nextDouble();
        time=t;

        double amount=(p*r*t)/100;
        System.out.println("______________________");

       System.out.println("Invested Amount: "+p);
       System.out.println("Est. Returns: "+(int)(amount));
       System.out.println("Total Value: "+(int)(amount+p));
    }
    
}
