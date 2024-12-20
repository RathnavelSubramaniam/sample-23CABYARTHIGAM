import java.util.*;

public class factorialRecursion {
public static void main(String[]args){
   System.out.println("PROGRAM TO FIND  THE FACTORIAL OF A GIVEN NUMBER USING RECURSION:");
    System.out.println("ENTER THE NUMBER TO FIND THE FACTORIAL:");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    if(n<0){
       System.out.println("Invalid Number");
       }else{
           System.out.println("FACTORIAL OF A GIVEN NUMBER IS:"+factorial(n));
        }
       }
    static int factorial(int n){
    if(n==0 || n==1){
        return 1;
    } else {
            return n*factorial(n-1);
        }
    }
}

