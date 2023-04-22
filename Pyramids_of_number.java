public class Pyramids_of_number {
    public static void main(String[] args){
        int n=5;
/* Print the below pattern
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

 */
/* Print this pattern
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

 */
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }
/* Print the below pattern
        1
        2 3
        4 5 6
        7 8 9 10
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }

 */
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1 ");
                    }
                    else {
                        System.out.print("0 ");
                    }

                }
                else{
                    if(j%2==0){
                        System.out.print("0 ");
                    }
                    else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
