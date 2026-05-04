package arrays;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] array=new int[arraySize];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        } 
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:array){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest && num !=firstLargest){
                secondLargest=num;
            }
        }
        System.out.println(secondLargest);
    }
}
