public class RecursionBasics {
    public static void PrintDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);

    }

    public static void PrintInc(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
         PrintInc(n-1);
         System.out.print(" " +n);
    }

    public static void main(String args[]){
        int n = 10;
        PrintDec(n);
        PrintInc(5);


    }
    
}
