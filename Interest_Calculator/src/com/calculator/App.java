import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
      
        try(Scanner sc=new Scanner(System.in))
        {
            ops(sc);
        }


    }

    public static void ops(Scanner sc)
    {
        boolean a=true;
        while(a)
        {
            System.out.println("**********************************");
            System.out.println("Press 1 for SIP calculator");
            System.out.println("Press 2 for Lumpsum calculator");
            System.out.println("press 3 for Simple Interest calculator");
            System.out.println("press 4 for exit....");
            System.out.println("**********************************");
            int i=sc.nextInt();

            if(i==1)
            {
                SIP sip=new SIP();
                sip.calculate(sc);
                System.out.println();
                System.out.println("______________________");
            }
            if(i==2)
            {
                Lumpsum lumpsum=new Lumpsum();
                lumpsum.calculate(sc);
                System.out.println();
                System.out.println("______________________");
            }
            if(i==3)
            {
                SimpleInterest si=new SimpleInterest();
                si.calculate(sc);
                System.out.println();
                System.out.println("______________________");
            }
            if(i==4)
            {
                a=false;
                System.out.println("******************************");
                System.out.println("Gracias.......................");
                System.out.println("******************************");
            }

        }
    }
}
