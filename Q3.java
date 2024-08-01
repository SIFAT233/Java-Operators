import java.util.Scanner;
public class Q3 {
    public static void main(String args[]) {
        
    
    Scanner scr=new Scanner(System.in);
    float a=scr.nextFloat();
    float b=scr.nextFloat();


    double X=(3.31*Math.pow(a,2)+2.01*Math.pow(b,3))/(7.16*Math.pow(b,2)+2.01*Math.pow(a,3));
    System.out.println("X= "+X);
}
}
