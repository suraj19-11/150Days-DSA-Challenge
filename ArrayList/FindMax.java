import java.util.ArrayList;

public class FindMax {
    //O(n)
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(5);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size()-1; i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
         System.out.println("MAximum number is "+max);
    }
}
