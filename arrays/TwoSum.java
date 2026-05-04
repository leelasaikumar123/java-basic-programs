package arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int target=sc.nextInt();
        int[] array=new int[arraySize];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int i=0;
        int j=array.length-1;
        boolean flag=false;
        while(i<j){
        if(array[i]+array[j]==target){
            System.out.println(array[i] +" "+array[j]);
            flag=true;
            break;
        }
      else  if(target<array[i]+array[j]){
            j--;
        }
      else{
        i++;
      }
        }
        if(!flag){
            System.out.println("No Two nums add up to give the target");
        }
    }
}
