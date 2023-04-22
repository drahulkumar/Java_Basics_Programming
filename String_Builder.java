import java.util.*;
public class String_Builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Char at a Index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);


        sb.delete(0,1);
        System.out.println(sb);

    }
}
