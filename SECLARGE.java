// second largest element of array 

import java.util.Scanner;

public class SECLARGE {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter size of array: ");

        int n= sc.nextInt();

        System.out.println("enter array elements: ");

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        if(n<2){
            System.out.println("Array must have at least two elements.");
            return ;
        }

        int max= arr[0];

        int secondmax= arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }

            if(arr[i]<max && arr[i]>secondmax){
                secondmax=arr[i];
            }

        }
        System.out.println(secondmax);

        sc.close();
    }

    
}
