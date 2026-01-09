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

    //Given number is Power of 2 or not
    public static boolean PowerOf2(int n){
        return (n&(n-1))==0;
    }

    //Count Set Bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while (n>0){
            if((n&1)!=0){
                count++;
            }
           n =  n>>1;
        }
        return count;
    }

    //Fast Exponentation
    public static int FastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(ithbit(6, 2));
        System.out.println(setIthBit(1, 2));
        System.out.println(clearIthBit(10, 3));
        System.out.println(updateIthBit(11, 2, 1));
        System.out.println(ClrLstIBits(10, 2));
        System.out.println(ClrRange(2515, 2, 7));
        System.out.println(PowerOf2(8));
        System.out.println(countSetBits(10));
        System.out.println(FastExpo(3,5));

        
    }
}
