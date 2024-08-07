import java.util.Scanner;
public class Q9 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        float a=src.nextFloat();
        float b=src.nextFloat();
        float c=src.nextFloat();
        float x,y,z;

        x=(a-b/3)+(c*2-1);

        y=a-(b/(3+c)*2)-1;

        z=a-((b/3)+c*2)-1;

        System.out.println("X : "+x);

        System.out.println("Y : "+y);
        
        System.out.println("Z : "+z);


        
    }
    
    
}
