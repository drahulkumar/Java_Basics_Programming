import java.util.Scanner;
public class User_Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter principle, rate and time");
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        int interest = (principle * rate * time)/100;
        System.out.println("Simple interest =" + interest);






    }
}
