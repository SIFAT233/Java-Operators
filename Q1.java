import java.util.Scanner;
public class Q1 {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        float O=scr.nextFloat();
        float  P=scr.nextFloat();
        float Add,Sub,mul,dev,rem;
        Add=O+P;
        Sub=O-P;
        mul=O*P;
        dev=O/P;
        rem=O%P;
        System.out.println("Addition:"+Add);

        System.out.println("Subtraction:"+Sub);

        System.out.println("Multiplication:"+mul);

        System.out.println("Quotient :"+dev);
        
        System.out.println("Reminder:"+rem);



        
    }
    
}
