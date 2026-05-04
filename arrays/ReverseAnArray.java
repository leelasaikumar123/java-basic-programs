package arrays;

import java.util.Scanner;

public class ReverseAnArray {
   public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] array=new int[arraySize];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        } 
        int i=0;
        int j=array.length-1;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
             i++;
            j--;
        }
        for(int num:array){
            System.out.print(num+" ");
        }
   } 
}
