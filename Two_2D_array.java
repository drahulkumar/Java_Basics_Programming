import java.util.*;
public class Two_2D_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int column = 5;

        int[][] twoDarray = new int[rows][column];

        for(int i=0; i<rows;i++){
            for(int j=0;j<column;j++){
                twoDarray[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(twoDarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
