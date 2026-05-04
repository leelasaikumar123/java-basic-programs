package arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] array=new int[arraySize];
            for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        } 
        int max=Integer.MIN_VALUE;
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
