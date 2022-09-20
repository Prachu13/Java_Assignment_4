/*WAP to show the try - catch block to catch the different types of exception */
import java.util.*;
public class pr1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1,2 or 3 : ");
        int n=sc.nextInt();
        try{
            if(n==1){
            System.out.println(1/0);}
            else if(n==2)
            {
                int[] a=new int[3];
                System.out.println("OK:"+a[4]);
            }
            else if(n==3)
            {
                String s=null;
                System.out.println(s.charAt(1));
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}