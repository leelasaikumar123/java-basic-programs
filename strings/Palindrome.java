 package strings;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   if(isItAPalindrome(s)){
    System.out.println("It is Palindrome");
   }
   else{
    System.out.println("It's not a Palindrome");
   }
}
 public static boolean isItAPalindrome(String s){
     int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s.charAt(i) !=s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
 }   
}