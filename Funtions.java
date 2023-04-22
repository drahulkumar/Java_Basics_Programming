import java.util.*;
public class Funtions {
    public static int Sum_of_two_numbers(int a , int b){
        return a +b;
    }
    public static int substractin(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;

    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int modulus(int a, int b){
        return a%b;
    }
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Sum_of_two_numbers(a,b));
        System.out.println(substractin(a,b));
        System.out.println(multiplication(a,b));
        System.out.println(division(a,b));
        System.out.println(modulus(a, b));
        System.out.println(factorial(a));
    }
}
