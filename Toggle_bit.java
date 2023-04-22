public class Toggle_bit {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;

        int BitMask = 1<<pos;

        if((BitMask & n) == 0){

            int new_number = BitMask | n;

            System.out.println(new_number);
        }
        else{

            int notBitMask = ~BitMask;
            int new_number1 = notBitMask & n;
            System.out.println(new_number1);
        }
    }
}
