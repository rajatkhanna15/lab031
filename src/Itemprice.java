import java.util.Scanner;
public class Itemprice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price");
        double p=sc.nextDouble();
        String s=String.valueOf(p);

        String x=s.substring(s.indexOf(".")+1);
        String y=s.substring(0,s.indexOf("."));
        System.out.println(y+" rupees and "+x+" paisa ");
    }
}
