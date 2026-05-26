public class BinaryString {
    public static void BS(int n,int lastPlace , String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //Kaam 
        BS(n-1, 0, str+"0");
         if(lastPlace == 0){
            BS(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        BS(3, 0, "");
    }
    
}
