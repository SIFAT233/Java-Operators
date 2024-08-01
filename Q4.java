import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
      Scanner scr=new Scanner(System.in);
      int s=scr.nextInt();

      System.out.println("X++ :"+(s++));

      System.out.println("++X :"+(++s));

      System.out.println("X-- :"+(s--));
      
      System.out.println("--X :"+(--s));
        
    }
}