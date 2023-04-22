public class While_loop {
    public static void main(String[] args){
        int  i=35498;
        int count=0;
        while (i>0){
            count++;
            System.out.println(i);
            i = i/10;
        }
        System.out.println(count);
    }
}
