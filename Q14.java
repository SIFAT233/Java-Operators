import java.util.Scanner;
public class Q14 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("Please input number");
        float x=src.nextFloat();
        double a=Math.ceil(x);
        System.out.println("A "+(int)a);
        double b=Math.floor(x);
        System.out.println("B "+(int)b);
        System.out.print("C "+x);
        

    }
    
}
