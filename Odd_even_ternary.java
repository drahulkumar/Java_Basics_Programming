import java.util.Scanner;
public class Odd_even_ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String ans = number%2 ==0 ? "Even" : "Odd";
        System.out.println(ans);

    }
}
