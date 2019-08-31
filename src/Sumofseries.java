import java.util.Scanner;
public class Sumofseries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        double sum=0;
        double i=1;
        for(i=1;i<=n;i++)
        {
            sum=sum+(1/i);

        }
        System.out.println("SUM="+sum);
    }
}



