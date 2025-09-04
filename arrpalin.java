import java.util.Scanner;
public class arrpalin{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of arr:");
        int n= sc.nextInt();
        System.out.println("enter elements  of arr:");
        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int start=0;
        int end= n-1;

        boolean isPalindrome= true;

        for(int i=0;i<n/2;i++){
            if(arr[start]!=arr[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;

        }
        if(isPalindrome){
            System.out.println("array is palindrome");
        }
        else{
            System.out.println("array is not palindrome");
        }

        sc.close();

    }
}