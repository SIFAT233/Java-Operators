import java.util.Scanner;
public class Q11 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);

        System.out.println("Input A : ");

        float a=src.nextFloat();

        System.out.println("Input B : ");

        float b=src.nextFloat();

        System.out.println("Input C : ");

        float c=src.nextFloat();

        System.out.println("1)"+(((a+b)<=80 && b>=0) ? 1:0));

        System.out.println("2)" +(((a-b)==0||c!=0)?1:0));

        System.out.println("3)"+(((a!=b ||(b<a)&&c>0)?1:0)));

    }
}

