import java.util.Scanner;
public class Largest_of_N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;


        for(int i=0;i<N;i++){
           int new_number = sc.nextInt();
           if(new_number>max){
               max = new_number;
           }

        }

        System.out.println(max);
    }
}
