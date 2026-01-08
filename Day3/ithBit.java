public class ithBit {
    public static int ithbit(int n, int i){
        int Bitmask = 1<<i;
        if((n & Bitmask )== 0){
            return 0;
        }else{
            return 1;
        }
        
    }

    //Set ith Bit
    public static int setIthBit(int n, int i){
        int bitmark = 1<<i;
       return n|bitmark;
    }

    //Clear ith Bit
      public static int clearIthBit(int n, int i){
        int bitmark = ~(1<<i);
       return n&bitmark;
    }

    //Update Ith Bit
     public static int updateIthBit(int n, int i, int newBit){
        //Method-1
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        //Method-2

         n = clearIthBit(n,i);
        int bitmark = newBit<<i;
        return n|bitmark;
    }

    //Clear last i bits
    public static int ClrLstIBits(int n, int i){
        int bitmark = (~0)<<i;
        return n&bitmark;
    }
    //Clear Range Of Bits
    public static int ClrRange(int n,int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
        
    }
    public static void main(String[] args) {
        System.out.println(ithbit(6, 2));
        System.out.println(setIthBit(1, 2));
        System.out.println(clearIthBit(10, 3));
        System.out.println(updateIthBit(11, 2, 1));
        System.out.println(ClrLstIBits(10, 2));
        System.out.println(ClrRange(2515, 2, 7));
        
    }
}
