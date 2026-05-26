public class FirstOccur {
    
    public static int FO(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return FO(arr, key, i+1);


    }  

    //Last Occurance   This is my approach which is best
    public static int LO(int arr[], int key, int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return LO(arr, key,i-1);
    }

    //By shraddha didi method 
    public static int SLO(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = SLO(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,7,5};
        System.out.println(FO(arr, 7, 0));
        System.out.println(LO(arr, 7,arr.length-1));
        System.out.println(SLO(arr, 7,0));

    }
    
}
