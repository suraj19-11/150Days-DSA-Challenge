import java.util.*;
public class Palindrome {
    public static boolean palindrome(String name){
        int n = name.length();
        for(int i=0; i<n/2; i++){
             if(name.charAt(i) != name.charAt(n-i-1)){ 
                  return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(palindrome(name));
        sc.close();
    }
    
    
}
