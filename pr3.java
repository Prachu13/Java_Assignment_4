import java.util.Scanner;

public class pr3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=500;
        int[] array = {10,20,30};
        try{
            System.out.print("enter a number : ");
            int b = sc.nextInt();
            System.out.println(a + " divide by " + (b)+ " equals to " + (a/b));
            System.out.print("Enter index number to access the array element : ");
            b = sc.nextInt();
            System.out.println(array[b]);
        }
        catch(ArithmeticException e){
            System.out.println("Exeption : "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exeption : "+e.getMessage());
        }
        finally{
            System.out.println("Finallay block executes.");
        }
    }
}
