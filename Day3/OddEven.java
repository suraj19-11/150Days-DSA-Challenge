public class OddEven {
    //Odd Even Check in Bit Manipulation

    public static void Oddeven(int n){
        int Bitmask = 1;
        if((n & Bitmask) == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }  
    }
    public static void main(String[] args) {
        Oddeven(66);
        Oddeven(5);
        Oddeven(3);
        Oddeven(2);
        
    }

}
