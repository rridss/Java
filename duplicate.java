// check is array has duplicates or not

import java.util.Scanner;
public class duplicate {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n= sc.nextInt();
        System.out.println("enter array elements: ");
        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean isDuplicate= false;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                isDuplicate=true;
                break;
            }

            }
            if(isDuplicate){
                break;
            }
            
        }
        if(isDuplicate){
             System.out.print("array has duplicates ");
        }
        else{
            System.out.print("array has no duplicates ");

        }
        sc.close();

    }
    
}
