import java.util.ArrayList;
public class Allop {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //Add Element
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);

        list.add(1,9); //O(n)
        System.out.println(list);

        //Get Element
        int get = list.get(2);
        System.out.println(get);

        //Remove element
        list.remove(1);
        System.out.println(list);

        //Set Element
        list.set(1,7);
        System.out.println(list);

        //Contain Element
        System.out.println(list.contains(5));
        System.out.println(list.contains(2));

        //Size of Arraylist
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Reverse in ArrayList - O(n)
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
