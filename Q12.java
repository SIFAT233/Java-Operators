import java.util.Scanner;
public class Q12 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        float a=src.nextFloat();
        float b=src.nextFloat();
        float c=src.nextFloat();
        
        float x=(b*b-4*a*c);
        if(x>0){
            float s=(float) ((-b+Math.sqrt(x))/(2*a));
            float i=(float) ((-b-Math.sqrt(x))/(2*a));
            System.out.println("Root1:"+s);
            System.out.println("Root2:"+i);
        }
        else if(x==0)
        {
            float p=(-b/2*a);
            System.out.println("Ans is "+p);
        }
        else
        {
            System.out.println("Imaginary");
        }
    }
    
}
