import java.util.*;
public class Loop_assignment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int check;

        do{
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            } else if (marks>=60 && marks<=89) {
                System.out.println("This is also Good");
                
            } else if (marks>=0 && marks<=59) {
                System.out.println("This is Good as well");

            }
            else {
                System.out.println("Invalid marks");
            }
            check = sc.nextInt();


        }while (check==1);

    }
}
