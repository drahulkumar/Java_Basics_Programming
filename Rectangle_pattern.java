public class Rectangle_pattern {
    public static void main(String[] args){
        int row = 5;
        int column=4;

        for(int i=1;i<=column;i++){
            for(int j=1;j<=row;j++){
                if(j==1 || j==row){
                    System.out.print("* ");
                } else if (i==1||i==column) {
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
