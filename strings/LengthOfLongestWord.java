package strings;

import java.util.Scanner;

public class LengthOfLongestWord {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
  String[] array=s.split(" ");
  int maxLength=0;
  int index=-1;
  for(int i=0;i<array.length;i++){
    if(array[i].length()>maxLength){
        maxLength=array[i].length();
 index=i;
    }
  }
  System.out.println(array[index]);
    }
}
