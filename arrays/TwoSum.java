package arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    
        int target = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        // Two loops
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                    break; 
                }
            }
            if(found) break; 
        }

        if(!found) {
            System.out.println("No two nums add up to give the target");
        }
    }
}
