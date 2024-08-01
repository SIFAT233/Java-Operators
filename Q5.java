import java.util.Scanner;
public class Q5 {
    public static void main(String args[])
    {
       Scanner src=new Scanner(System.in);
       float a=src.nextFloat();
       float b=src.nextFloat();
       float x=a;
       x+=b;
       float y=a;
       y-=b;
       System.out.println("Incremented Value:" +x);
       System.out.println("Decremented Value:" +y);
    }
}
