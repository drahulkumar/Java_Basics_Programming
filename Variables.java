public class Variables {
    public static void main(String[] args) {
        char c='=';
        boolean bool = true;
        System.out.println(c);
        System.out.println(bool);

        short s = 5;
        System.out.println(s);

        int i=10;
        System.out.println(i);

        long l=200000000000000000L;
        Long L1 = 2_000_000_000_000L;
        System.out.println(l);
        System.out.println(L1);

        byte b=2;
        System.out.println(b);

        float f = 3.4F;
        System.out.println(f);

        double d=2.7;
        System.out.println(d);

        String S1 = "I love Sakshi";
        System.out.println(S1);

        System.out.println(S1.charAt(2));
        System.out.println(S1.charAt(8));

        String s2 = """ 
                essay, an analytic, interpretative,
                or critical literary composition usually 
                much shorter and less systematic and formal
                than a dissertation or thesis and usually dealing 
                with its subject from a limited and often
                personal point of view.""";

        System.out.println(s2);


    }
}
