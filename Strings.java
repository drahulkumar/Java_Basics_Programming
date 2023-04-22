import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : "+ name);

        //Concatenation
        String firstname = "Rahul";
        String lastname = "Dubey";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // Length of String

        System.out.println(fullname.length());

        //CharAt

        for(int i=0; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        // COmpare TO
        String name1 = "Tony";
        String name2 = "Tomy";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");

        }

        String sentence = "My name is Tony";
        String new_name = sentence.substring(11, sentence.length());
        System.out.println(new_name);

    }
}
