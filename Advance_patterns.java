public class Advance_patterns {
    public static void main(String[] args){
        int n = 5;
/*Print this pattern
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *


 */
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=2*n; j++){
//                if((j<=i) || (j>2*n-i)){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=2*n; j++){
//                if((j<=i) || (j>=2*n-i+1)){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
