import java.util.*;
public class Conversion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature in fahrenheit");
        double f=sc.nextDouble();
        double c=(f-32)/1.8;
        System.out.println("temperature in celsius :"+c);

    }
}
