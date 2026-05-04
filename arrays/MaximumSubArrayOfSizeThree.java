package arrays;

import java.util.Scanner;

public class MaximumSubArrayOfSizeThree {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] array=new int[arraySize];
            for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        } 
        int l=0;
        int maxSubArray=Integer.MIN_VALUE;
        int sum=0;
        for(int r=0;r<array.length;r++){
            sum=sum+array[r];
            if(r-l==3){
                sum=sum-array[l];
                l++;
            }
            if(r-l==2){
        if(sum>maxSubArray){
            maxSubArray=sum;
        }
            }
        }
        System.out.println(maxSubArray);
    }
}
