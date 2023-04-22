import java.util.*;
public class Fibonacci_seris {
    public static void fibonacci(int n){
        if(n>=2){
            int n1 = 0;
            int n2 = 1;
            int n3 = 1;
            System.out.print(n1 +" " + n2 + " ");
            for(int i=3;i<=n;i++){
                System.out.print(n3 +" ");

                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
        } else if (n<=0) {
              System.out.println("No fibonacci number exit");
        }
        else if(n==1){
           System.out.println("0");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);



    }
}
