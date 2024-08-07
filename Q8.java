import java.util.Scanner;
public class Q8{
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int s=src.nextInt();
        int b=src.nextInt();
        if (s>b) {
            System.out.println("Max is "+s);
            
        }
        else
        System.out.println("Max is "+b);


    }

}