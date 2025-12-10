public class SubString {
    public static String SS(String str,int si, int ei ){
        String substr = "";
        for(int i=si; i<ei; i++ ){
            substr += str.charAt(i);
        }
        return substr;

    }

    //Using String Builder
    public static String stb(String str, int s, int e){
        StringBuilder sb = new StringBuilder("");
        for(int i=s; i<e; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(SS(str, 1,5));
        System.out.println(stb(str, 0,5));  //StringBuilder Method
        System.out.println(str.substring(2,7));  //Direct function for substring
    }
}


