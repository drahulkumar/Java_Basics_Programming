public class Bit_Manipulation {
    public static void main(String args[]){
        //Get Bit

//        int n = 15;
//        int pos = 2;
//        int BM = 1<<pos;
//        if((BM & n) == 0 ){
//            System.out.println("The bit was 0");
//        }
//        else {
//            System.out.println("Bit was 1");
//        }


        // Set Bit

//        int n1 = 5;
//        int pos = 1;
//        int Bitmask = 1<<pos;
//        int new_number = Bitmask | n1;
//
//        System.out.println(new_number);

        // Clear Bit
        int n = 5;
        int pos = 2;
        int Bitmask = 1<<pos;

        int notBitmask = ~Bitmask;

        int new_number  = n & notBitmask;

        System.out.println(new_number);


    }
}
