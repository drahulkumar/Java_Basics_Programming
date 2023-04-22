import java.util.*;
public class Switch_statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String str = sc.next();

        switch (str) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            case "%" -> System.out.println(a % b);
            default -> System.out.println("Invalid Input");
        }

    }
}
