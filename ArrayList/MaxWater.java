import java.util.ArrayList;

public class MaxWater {
    public static int maxWater(ArrayList<Integer> list){
        int maxWater = 0;
        //Brute force
        //TC: O(n^2)
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size();j++){
                int height = Math.min(list.get(i),list.get(j));
                int width = j - i;
                int currWater = height * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // 2-Pointer Approach
    public static int maxWaterr(ArrayList<Integer> list){
        int maxWater = 0;
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){
            //Calculate water area
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp -lp;
            int currWater = height * width;
            maxWater = Math.max(maxWater, currWater);

            //update pointer
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();  //here list is height 
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWater(list));
        System.out.println(maxWaterr(list));
    }
}
