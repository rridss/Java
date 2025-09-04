// check if array is sorted or not

import java.util.Scanner;

public class arrsort {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY: ");
        int n= sc.nextInt();

        System.out.println("ENTER ARRAY elements: ");

        int [] arr= new int[n];

        for(int i=0;i<n;i++){

            arr[i]= sc.nextInt();
            
        }

        boolean isSorted= true;

        // yha hum nested loop bhi use kr skte thee but time complexity n square hogat
        // hume sirf adjacent element check krna h isliye hum o (n) me bhi solva ekr skte h

        for(int i= 0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    isSorted= false;
                    break;
                }
                
            }

        if(isSorted){
             System.out.println("array is sorted");
        }
        else{
             System.out.println("array is not sorted");
        }

        sc.close();

    }
    
}
