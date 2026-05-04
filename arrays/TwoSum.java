package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println(num + " " + complement);
                found = true;
                break;
            }

            set.add(num);
        }

        if (!found) {
            System.out.println("No Two nums add up to give the target");
        }
    }
}
