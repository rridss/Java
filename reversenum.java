// reverse a integer 

import java.util.Scanner;
public class reversenum {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a= sc.nextInt();

        int reversed=0;

        while (a>0){
        int digit= a%10;
        reversed= reversed*10+digit;
        a=a/10;
        }
        System.out.println("Reversed integer: " + reversed);
        sc.close();
    }
    
}
