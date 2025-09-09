
// Question 1: Two Sum Problem

// 👉 Problem:
// You are given an array of integers and a target value. Return the indices of the two numbers such that they add up to the target.

// Example:

// Input: nums = [2,7,11,15], target = 9  
// Output: [0,1]   // because nums[0] + nums[1] = 2 + 7 = 9

import java.util.Scanner;
public class twosum {
    public static void main(String [] args){
        int [] arr= {2,7,5,4, 11};
        int n= arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();


        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = arr[i] +arr[j];
                if(sum==target){
                    System.out.println("["+ i + ","+ j +"]");
                    found=true;
        }
            }
    
        }
        if(!found){
            System.out.println("not found pair");
        }

        sc.close();
       
    }

}
