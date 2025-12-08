public class SubString {
    public static String SS(String str,int si, int ei ){
        String substr = "";
        for(int i=si; i<ei; i++ ){
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(SS(str, 1,5));
        System.out.println(str.substring(2,7));
    }
}


